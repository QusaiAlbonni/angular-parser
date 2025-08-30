const Mini = (() => {
  const components = new Map();
  const singletons = new Map();
  const componentInstances = new Map();
  const routeDefs = [];
  let rootEl = null;

  let idCounter = 0;
  function generateComponentId() {
    return `comp_${Date.now()}_${idCounter++}_${Math.random().toString(36).substr(2, 9)}`;
  }

  function defineComponent(selector, C, template) {
    components.set(selector, { C, template, selector });
  }
  
  /**
   * @param className string
   */
  function defineService(className, factory) {
    if (!singletons.has(className)) singletons.set(className.toLowerCase(), factory());
    return singletons.get(className);
  }
  
  function setRoutes(rawRoutes) {
    routeDefs.length = 0;
    for (const r of rawRoutes) {
      if (r.redirectTo) routeDefs.push({ redirectTo: cleanPath(r.redirectTo) });
      else routeDefs.push({ pathParts: cleanPath(r.path).split('/').filter(Boolean), component: r.component });
    }
  }
  
  function addRoutes(routes){
    setRoutes(routes.map(r => {
      if (r.redirectTo) return { path: '', redirectTo: r.redirectTo };
      return { path: r.path, component: r.component };
    }));
  }
  
  function mount(rootSelector) {
    rootEl = document.querySelector(rootSelector);
    if (!rootEl) throw new Error(`Root element ${rootSelector} not found`);
    window.addEventListener('hashchange', render);
    render();
  }

  function cleanPath(p = '') { return String(p).replace(/^#?\/+/, '').replace(/\/+$/, ''); }
  
  function currentSegments() {
    const h = location.hash.replace(/^#\/?/, '');
    if (h) return h.split('/').filter(Boolean);
    const sp = new URL(location.href).searchParams.get('r');
    return cleanPath(sp || '').split('/').filter(Boolean);
  }
  
  function matchRoute(segs) {
    for (const r of routeDefs) {
      if (r.redirectTo) continue;
      if (r.pathParts.length !== segs.length) continue;
      const params = {};
      let ok = true;
      for (let i = 0; i < r.pathParts.length; i++) {
        const rp = r.pathParts[i], sp = segs[i];
        if (rp.startsWith(':')) params[rp.slice(1)] = sp;
        else if (rp !== sp) { ok = false; break; }
      }
      if (ok) return { route: r, params };
    }
    const redir = routeDefs.find(r => r.redirectTo);
    if (redir) { location.hash = '#/' + redir.redirectTo; }
    return null;
  }

  const Router = {
    navigate(parts) {
      const arr = Array.isArray(parts) ? parts : [parts];
      const segs = arr.map(x => cleanPath(String(x))).filter(Boolean);
      location.hash = '#/' + segs.join('/');
    }
  };

  defineService('Router', () => Router);

  class ActivatedRoute {
    constructor(params) {
      this.snapshot = { params: params || {}, paramMap: new Map(Object.entries(params || {})) };
    }
    param(name) { return this.snapshot.paramMap.get(name); }
  }

  function registerComponentInstance(instance) {
    const id = generateComponentId();
    instance.__componentId = id;
    componentInstances.set(id, instance);
    return id;
  }
  
  function getComponentInstance(id) {
    return componentInstances.get(id);
  }
  
  function clearComponentInstances() {
    componentInstances.clear();
  }

  function render() {
    if (!rootEl) return;
    
    clearComponentInstances();

    const segs = currentSegments();
    const match = matchRoute(segs);
    if (!match) return;

    const rootSelector = rootEl.tagName.toLowerCase();
    const appMeta = Array.from(components.values()).find(m => m.selector === rootSelector);

    if (!appMeta) {
      renderSingle(match);
      return;
    }

    const appInstance = constructWithDI(appMeta.C, {});
    const appComponentId = registerComponentInstance(appInstance);

    if (typeof appInstance.ngOnInit === 'function') {
      try { appInstance.ngOnInit(); } catch (e) { console.error(e); }
    }

    const appFrag = compileTemplate(appMeta.template, appInstance, appComponentId);
    const tempHost = document.createElement('div');
    tempHost.appendChild(appFrag);

    let outlet = tempHost.querySelector('router-outlet,[data-router-outlet]');
    if (!outlet) outlet = tempHost.querySelector('[data-router-outlet]');
    if (!outlet) {
      console.warn('No <router-outlet> in AppComponent; rendering route only.');
      renderSingle(match);
      return;
    }

    const childMeta = Array.from(components.values()).find(m => m.C === match.route.component);
    if (!childMeta) {
      outlet.replaceWith(document.createTextNode('Route component not found.'));
    } else {
      const childInstance = constructWithDI(childMeta.C, match.params);
      const childComponentId = registerComponentInstance(childInstance);
      
      if (typeof childInstance.ngOnInit === 'function') {
        try { childInstance.ngOnInit(); } catch (e) { console.error(e); }
      }
      
      const childFrag = compileTemplate(childMeta.template, childInstance, childComponentId);
      const holder = document.createElement('div');
      holder.appendChild(childFrag);
      const replacement = document.createElement('div');
      replacement.innerHTML = holder.innerHTML;
      outlet.replaceWith(...Array.from(replacement.childNodes));
    }

    rootEl.innerHTML = '';
    while (tempHost.firstChild) rootEl.appendChild(tempHost.firstChild);

    wireBindings(rootEl);
  }

  function renderSingle(match) {
    const childMeta = Array.from(components.values()).find(m => m.C === match.route.component);
    if (!childMeta) {
      rootEl.innerHTML = '<p>Route component not found.</p>';
      return;
    }
    
    clearComponentInstances();
    const inst = constructWithDI(childMeta.C, match.params);
    const componentId = registerComponentInstance(inst);
    
    if (typeof inst.ngOnInit === 'function') {
      try { inst.ngOnInit(); } catch (e) { console.error(e); }
    }
    
    const frag = compileTemplate(childMeta.template, inst, componentId);
    rootEl.innerHTML = '';
    rootEl.appendChild(frag);
    wireBindings(rootEl);
  }

  function constructWithDI(C, params) {
    const m = C.toString().match(/constructor\s*\(([^)]*)\)/);
    const names = m && m[1].trim() ? m[1].split(',').map(s => s.trim()).filter(Boolean) : [];
    const deps = names.map(n => {
      n = n.toLowerCase();
      if (n === 'router') return Router;
      if (n === 'activatedroute') return new ActivatedRoute(params);
      if (singletons.has(n)) return singletons.get(n);
      return undefined;
    });
    return new C(...deps);
  }

  // ---------------- Template compile ---------------- Majd King of all time...
  function compileTemplate(template, ctx, componentId) {
    const container = document.createElement('div');
    container.innerHTML = template;

    const rootElements = Array.from(container.children);
    if (rootElements.length === 1) {
      rootElements[0].setAttribute('data-component-id', componentId);
      rootElements[0].setAttribute('data-template-root', 'true');
    } else if (rootElements.length > 1) {
      const wrapper = document.createElement('div');
      wrapper.setAttribute('data-component-id', componentId);
      wrapper.setAttribute('data-template-root', 'true');
      while (container.firstChild) wrapper.appendChild(container.firstChild);
      container.appendChild(wrapper);
    }

    container.querySelectorAll('router-outlet').forEach(n => {
      const d = document.createElement('div');
      d.setAttribute('data-router-outlet', '');
      n.replaceWith(d);
    });

    expandNgFor(container, ctx, componentId);
    applyNgIf(container, ctx, componentId);

    processInterpolations(container, ctx, componentId);
    applyPropertyBindings(container, ctx, componentId);
    materializeRouterLinks(container);

    const frag = document.createDocumentFragment();
    while (container.firstChild) frag.appendChild(container.firstChild);
    return frag;
  }

  function expandNgFor(root, rootCtx, componentId) {
    root.querySelectorAll('*').forEach(node => {
      const attr = node.hasAttribute('*ngFor') ? '*ngFor'
                 : node.hasAttribute('*ngfor') ? '*ngfor' : null;
      if (!attr) return;
      
      const spec = node.getAttribute(attr) || '';
      node.removeAttribute(attr);
      const m = spec.match(/let\s+(\w+)\s+of\s+(.+)/);
      if (!m) return;
      
      const [, varName, arrExpr] = m;
      const arr = safeEval(rootCtx, arrExpr) || [];
      const frag = document.createDocumentFragment();
      
      for (const v of arr) {
        const clone = node.cloneNode(true);
        // Store scope data directly on element
        clone.setAttribute('data-ng-for-item', JSON.stringify(v));
        clone.setAttribute('data-ng-for-var', varName);
        clone.setAttribute('data-component-id', componentId);
        frag.appendChild(clone);
      }
      node.replaceWith(frag);
    });
  }

  function applyNgIf(root, rootCtx, componentId) {
    root.querySelectorAll('*').forEach(node => {
      const attr = node.hasAttribute('*ngIf') ? '*ngIf'
                 : node.hasAttribute('*ngif') ? '*ngif' : null;
      if (!attr) return;
      
      const expr = node.getAttribute(attr) || '';
      node.removeAttribute(attr);
      const scope = createScopeForElement(node, rootCtx);
      const ok = !!safeEval(scope, expr);
      
      if (!ok) node.replaceWith(document.createComment('ngIf removed'));
    });
  }

  function createScopeForElement(element, baseCtx) {
    const scope = Object.create(baseCtx);
    
    let current = element;
    while (current) {
      if (current.hasAttribute('data-ng-for-item')) {
        const varName = current.getAttribute('data-ng-for-var');
        const itemData = JSON.parse(current.getAttribute('data-ng-for-item'));
        scope[varName] = itemData;
      }
      current = current.parentElement;
    }
    
    return scope;
  }

  function findComponentForElement(element) {
    let current = element;
    while (current) {
      if (current.hasAttribute('data-template-root') || current.hasAttribute('data-component-id')) {
        const componentId = current.getAttribute('data-component-id');
        if (componentId) {
          return getComponentInstance(componentId);
        }
      }
      current = current.parentElement;
    }
    return null;
  }

  function processInterpolations(root, rootCtx, componentId) {
    const walker = document.createTreeWalker(root, NodeFilter.SHOW_TEXT, null);
    const nodes = [];
    while (walker.nextNode()) nodes.push(walker.currentNode);
    
    nodes.forEach(t => {
      const raw = t.nodeValue;
      if (!raw || raw.indexOf('{{') === -1) return;
      
      const scope = createScopeForElement(t.parentNode, rootCtx);
      t.nodeValue = raw.replace(/\{\{\s*([^}]+?)\s*\}\}/g, (_, e) => {
        const v = safeEval(scope, e);
        return escape(String(v ?? ''));
      });
    });
  }

  function applyPropertyBindings(root, rootCtx, componentId) {
    root.querySelectorAll('*').forEach(node => {
      if (node.hasAttribute('[src]')) {
        const expr = node.getAttribute('[src]');
        node.removeAttribute('[src]');
        const scope = createScopeForElement(node, rootCtx);
        const v = safeEval(scope, expr);
        if (v != null) node.setAttribute('src', String(v));
      }
    });
  }

  function materializeRouterLinks(root) {
    root.querySelectorAll('a').forEach(a => {
      const hasBracket = a.hasAttribute('[routerLink]') || a.hasAttribute('[routerlink]');
      const hasPlain = a.hasAttribute('routerLink') || a.hasAttribute('routerlink');

      if (hasBracket) {
        const expr = a.getAttribute('[routerLink]') ?? a.getAttribute('[routerlink]') ?? '';
        a.removeAttribute('[routerLink]');
        a.removeAttribute('[routerlink]');
        
        const component = findComponentForElement(a);
        const scope = createScopeForElement(a, component || {});
        const val = safeEval(scope, expr) || [];
        const parts = (Array.isArray(val) ? val : [val]).map(x => cleanPath(String(x)));
        const href = '#/' + parts.filter(Boolean).join('/');
        a.setAttribute('href', href);
        a.addEventListener('click', ev => {
          ev.preventDefault();
          Router.navigate(parts);
        });
        return;
      }
      
      if (hasPlain) {
        const v = a.getAttribute('routerLink') ?? a.getAttribute('routerlink') ?? '';
        a.removeAttribute('routerLink');
        a.removeAttribute('routerlink');
        const path = cleanPath(v);
        a.setAttribute('href', '#/' + path);
        a.addEventListener('click', ev => {
          ev.preventDefault();
          Router.navigate([path]);
        });
        return;
      }
      
      const href = a.getAttribute('href') || '';
      if (href && !/^(#|https?:|mailto:|tel:)/i.test(href)) {
        const path = cleanPath(href);
        a.setAttribute('href', '#/' + path);
        a.addEventListener('click', ev => {
          ev.preventDefault();
          Router.navigate([path]);
        });
      }
    });
  }

  function wireBindings(root) {
    root.querySelectorAll('*').forEach(node => {
      if (node.hasAttribute('(click)')) {
        const call = node.getAttribute('(click)') || '';
        node.removeAttribute('(click)');
        node.addEventListener('click', () => {
          const component = findComponentForElement(node);
          if (component) {
            const scope = createScopeForElement(node, component);
            invokeInContext(scope, call, component);
            render();
          }
        });
      }

      if (node.tagName === 'FORM' && node.hasAttribute('(ngSubmit)')) {
        const call = node.getAttribute('(ngSubmit)') || '';
        node.removeAttribute('(ngSubmit)');
        node.addEventListener('submit', (e) => {
          e.preventDefault();
          const component = findComponentForElement(node);
          if (component) {
            const scope = createScopeForElement(node, component);
            invokeInContext(scope, call, component);
            render();
          }
        });
      }

      if (node.hasAttribute('[(ngModel)]')) {
        const path = node.getAttribute('[(ngModel)]') || '';
        node.removeAttribute('[(ngModel)]');
        const component = findComponentForElement(node);
        if (component) {
          const cur = getPath(component, path);
          node.value = node.type === 'number' ? (cur ?? 0) : (cur ?? '');
          const handler = () => {
            const v = node.type === 'number' ? Number(node.value) : node.value;
            setPath(component, path, v);
          };
          node.addEventListener('input', handler);
          node.addEventListener('change', handler);
        }
      }
    });
  }

  function parseCallExpression(expr) {
    const m = expr.match(/^\s*([A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*)\s*\((.*)\)\s*$/);
    if (!m) return null;
    return { calleePath: m[1], argsSrc: m[2] };
  }
  
  function getOwnerAndFn(ctx, path, preferredOwner) {
    const parts = path.split('.');
    const prop = parts.pop();
    
    if (preferredOwner && typeof preferredOwner[prop] === 'function') {
      return { owner: preferredOwner, fn: preferredOwner[prop] };
    }
    
    let owner = parts.length ? parts.reduce((o, k) => (o ? o[k] : undefined), ctx) : ctx;
    let fn = owner ? owner[prop] : undefined;
    
    return { owner, fn };
  }
  
  function evalArgsArray(ctx, argsSrc) {
    const src = String(argsSrc || '').trim();
    if (!src) return [];
    try {
      return Function('ctx', 'with(ctx){ return [' + src + ']; }')(ctx);
    } catch {
      return [];
    }
  }
  
  function invokeInContext(ctx, expr, component) {
    const parsed = parseCallExpression(expr);
    if (!parsed) return safeEval(ctx, expr);
    
    const { owner, fn } = getOwnerAndFn(ctx, parsed.calleePath, component);
    if (typeof fn !== 'function') return safeEval(ctx, expr);
    
    const args = evalArgsArray(ctx, parsed.argsSrc);
    return fn.apply(owner, args);
  }

  function safeEval(ctx, expr) {
    try {
      return Function('ctx', 'with(ctx){return(' + expr + ')}')(ctx);
    } catch (e) {
      console.log(e);
      return undefined;
    }
  }
  
  function getPath(obj, path) {
    return String(path).split('.').reduce((o, k) => (o ? o[k] : undefined), obj);
  }
  
  function setPath(obj, path, val) {
    const parts = String(path).split('.');
    const last = parts.pop();
    const target = parts.reduce((o, k) => (o ? o[k] : undefined), obj);
    if (target && last) target[last] = val;
  }
  
  function escape(s) {
    return s.replace(/[&<>"']/g, c => ({
      '&': '&amp;',
      '<': '&lt;',
      '>': '&gt;',
      '"': '&quot;',
      "'": '&#39;'
    }[c]));
  }

  return { defineComponent, defineService, setRoutes, addRoutes, mount, Router, ActivatedRoute };
})();