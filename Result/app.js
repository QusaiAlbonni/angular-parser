class AppComponent{
}

class Product{





constructor(id, name, description, imageUrl, price, ) {
this.id = id
this.name = name
this.description = description
this.imageUrl = imageUrl
this.price = price
}

}

class ProductService{


constructor() {
this.storageKey = 'products'
this.counterKey = 'productCounter'
if (localStorage.getItem(this.storageKey) === null) {
localStorage.setItem(this.storageKey, JSON.stringify([]))
}

if (localStorage.getItem(this.counterKey) === null) {
localStorage.setItem(this.counterKey, '0')
}

}

getProducts(){
const data = localStorage.getItem(this.storageKey)
if (data === null) {
return []
}

return JSON.parse(data)
}

saveProducts(products, ){
localStorage.setItem(this.storageKey, JSON.stringify(products))
}

getCounter(){
const value = localStorage.getItem(this.counterKey)
if (value === null) {
return 0
}

return parseInt(value, 10)
}

incrementCounter(){
let counter = this.getCounter() + 1
localStorage.setItem(this.counterKey, counter.toString())
return counter
}

getAll(){
return this.getProducts()
}

getById(id, ){
const products = this.getProducts()
for (let p of products) {
if (p.id === id) {
return p
}

}

return null
}

add(p, ){
const products = this.getProducts()
const id = this.getCounter()
const product = new Product(id, p.name, p.description, p.imageUrl, p.price)
products.push(product)
this.saveProducts(products)
this.incrementCounter()
}

}

class AddPage{






constructor(productService, router, ) {
this.productService = productService
this.router = router
}

save(){
this.productService.add({ name: this.name, description: this.description, price: Number(this.price), imageUrl: this.imageUrl || '' })
this.router.navigate(['/list'])
}

}

class ListPage{



constructor(productService, ) {
this.productService = productService
this.products = []
}

ngOnInit(){
this.products = this.productService.getAll()
}

}

class DetailsPage{




constructor(ActivatedRoute, router, productService, ) {
this.ActivatedRoute = ActivatedRoute
this.router = router
this.productService = productService
}

ngOnInit(){
const id = Number(this.ActivatedRoute.snapshot.paramMap.get('id'))
this.product = this.productService.getById(id)
}

back(){
this.router.navigate(['/list'])
}

}

Mini.defineComponent( 'app-root', AppComponent, `<div>




<h1>نظام إدارة المنتجات

</h1>
<nav>



<a routerLink="/add">إضافة

</a>
<a routerLink="/list">عرض

</a>

</nav>
<router-outlet>

</router-outlet>

</div>
`);
Mini.defineComponent( 'add-page', AddPage, `<h2>إضافة منتج

</h2>
<form (ngSubmit)="save()">
      
      
      
      

      
    
<input name="name" placeholder="اسم المنتج" required [(ngModel)]="name"/>
<input name="description" placeholder="الوصف" required [(ngModel)]="description"/>
<input name="price" type="number" placeholder="السعر" required [(ngModel)]="price"/>
<input name="imageUrl" placeholder="رابط الصورة" [(ngModel)]="imageUrl"/>
<button type="submit">حفظ

</button>

</form>
`);
Mini.defineComponent( 'list-page', ListPage, `<h2>قائمة المنتجات

</h2>
<div *ngIf="products.length > 0">
      
    
<div *ngFor="let p of products">
        
        
        
        
        
      
<img alt="صورة المنتج" *ngIf="p.imageUrl" [src]="p.imageUrl"/>
<h3>{{p.name}}

</h3>
<p>{{p.description}}

</p>
<p> {{p.price}}
<strong>السعر:

</strong>

</p>
<a [routerLink]="['/details', p.id]">تفاصيل

</a>

</div>

</div>
`);
Mini.defineComponent( 'details-page', DetailsPage, `<div *ngIf="product">
      
      
      
      
      
      
    
<h2>تفاصيل المنتج

</h2>
<img alt="صورة المنتج" *ngIf="product.imageUrl" [src]="product.imageUrl"/>
<h3>{{product.name}}

</h3>
<p>{{product.description}}

</p>
<p> {{product.price}}
<strong>السعر:

</strong>

</p>
<button (click)="back()">عودة

</button>

</div>
`);
Mini.defineService( 'ProductService', () => new ProductService());
const routes = [{ path: '', redirectTo: 'list', pathMatch: 'full' }, { path: 'add', component: AddPage }, { path: 'list', component: ListPage }, { path: 'details/:id', component: DetailsPage }];
Mini.addRoutes(routes);
