import '@angular/core' from 'Injectable';
import '@angular/common' from 'CommonModule';
import '@angular/forms' from 'FormsModule';
import '@angular/router' from 'ActivatedRoute';
class Product {





constructor(id, name, description, imageUrl, price) {
(this.id = id ? undefined : undefined);
(this.name = name ? undefined : undefined);
(this.description = description ? undefined : undefined);
(this.imageUrl = imageUrl ? undefined : undefined);
(this.price = price ? undefined : undefined);
}
}

@Injectable(
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ObjectDeclaration{
objectBody=
ObjectBody{
objectMemberList=[
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''root''}}}}
ID=providedIn}]}}}}}})
export class ProductService {


constructor() {
(this.storageKey = "'products'" ? undefined : undefined);
(this.counterKey = "'productCounter'" ? undefined : undefined);
if ((localStorage.
PrimaryExpression{
id='getItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='storageKey'}}}}}) === null ? undefined : undefined)) {
(localStorage.
PrimaryExpression{
id='setItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='storageKey'}}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='JSON'}, right=FunctionCall{
expression=
PrimaryExpression{
id='stringify'}
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[]}}}}}]}}}}}})   ? undefined : undefined);
}
if ((localStorage.
PrimaryExpression{
id='getItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='counterKey'}}}}}) === null ? undefined : undefined)) {
(localStorage.
PrimaryExpression{
id='setItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='counterKey'}}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''0''}}}})   ? undefined : undefined);
}
}
function getProducts() {
const data = (localStorage.
PrimaryExpression{
id='getItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='storageKey'}}}}})   ? undefined : undefined);
if ((data === null ? undefined : undefined)) {
return ([]   ? undefined : undefined);
}
return (JSON.
PrimaryExpression{
id='parse'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='data'}}}})   ? undefined : undefined);
}
function saveProducts((products   ? undefined : undefined);) {
(localStorage.
PrimaryExpression{
id='setItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='storageKey'}}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='JSON'}, right=FunctionCall{
expression=
PrimaryExpression{
id='stringify'}
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='products'}}}}]}}}}}})   ? undefined : undefined);
}
function getCounter() {
const value = (localStorage.
PrimaryExpression{
id='getItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='counterKey'}}}}})   ? undefined : undefined);
if ((value === null ? undefined : undefined)) {
return (0   ? undefined : undefined);
}
return (
PrimaryExpression{
id='parseInt'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='value'}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
numberValue='10'}}}})   ? undefined : undefined);
}
function incrementCounter() {
let counter = (this.
PrimaryExpression{
id='getCounter'}()   ? undefined : undefined);
(counter = counter ? undefined : undefined);
(localStorage.
PrimaryExpression{
id='setItem'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='counterKey'}}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='counter'}, right=FunctionCall{
expression=
PrimaryExpression{
id='toString'}
argumentList=
ArgumentList{
expressionList=[]}}}}}})   ? undefined : undefined);
return (counter   ? undefined : undefined);
}
function getAll() {
return (this.
PrimaryExpression{
id='getProducts'}()   ? undefined : undefined);
}
function getById(id: ) {
const products = (this.
PrimaryExpression{
id='getProducts'}()   ? undefined : undefined);
for (for (let p of 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='products'}}}})) {
if ((p.id === id ? undefined : undefined)) {
return (p   ? undefined : undefined);
}
}
return (null   ? undefined : undefined);
}
function add(p: ) {
const products = (this.
PrimaryExpression{
id='getProducts'}()   ? undefined : undefined);
const id = (this.
PrimaryExpression{
id='getCounter'}()   ? undefined : undefined);
const product = (Product((id   ? undefined : undefined), (p.name   ? undefined : undefined), (p.description   ? undefined : undefined), (p.imageUrl   ? undefined : undefined), (p.price   ? undefined : undefined))   ? undefined : undefined);
(products.
PrimaryExpression{
id='push'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='product'}}}})   ? undefined : undefined);
(this.
PrimaryExpression{
id='saveProducts'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='products'}}}})   ? undefined : undefined);
(this.
PrimaryExpression{
id='incrementCounter'}()   ? undefined : undefined);
}
}

@Component(
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ObjectDeclaration{
objectBody=
ObjectBody{
objectMemberList=[
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''add-page''}}}}
ID=selector}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='true'}}}}
ID=standalone}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='CommonModule'}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='FormsModule'}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='RouterModule'}}}}]}}}}}
ID=imports}, 
ObjectMember{
template=Template{
htmlElements=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='افة من'}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[AngularAttribute{
eventBindingAttribute=EventBindingAttribute{
tagName='ngSubmit'
attributeValue='"save()"'}
]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='    '}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[HtmlAttribute{
value='name="name"'}
, HtmlAttribute{
value='placeholder="اسم المنتج"'}
, HtmlAttribute{
value='required'}
]
angularAttributes=[AngularAttribute{
bindingAttribute=null
eventBindingAttribute=null
forAttribute=null
ifAttribute=null}
]
htmlContent=null}
, HtmlElement{
htmlAttributes=[HtmlAttribute{
value='name="description"'}
, HtmlAttribute{
value='placeholder="الوصف"'}
, HtmlAttribute{
value='required'}
]
angularAttributes=[AngularAttribute{
bindingAttribute=null
eventBindingAttribute=null
forAttribute=null
ifAttribute=null}
]
htmlContent=null}
, HtmlElement{
htmlAttributes=[HtmlAttribute{
value='name="price"'}
, HtmlAttribute{
value='type="number"'}
, HtmlAttribute{
value='placeholder="السعر"'}
, HtmlAttribute{
value='required'}
]
angularAttributes=[AngularAttribute{
bindingAttribute=null
eventBindingAttribute=null
forAttribute=null
ifAttribute=null}
]
htmlContent=null}
, HtmlElement{
htmlAttributes=[HtmlAttribute{
value='name="imageUrl"'}
, HtmlAttribute{
value='placeholder="رابط الصورة"'}
]
angularAttributes=[AngularAttribute{
bindingAttribute=null
eventBindingAttribute=null
forAttribute=null
ifAttribute=null}
]
htmlContent=null}
, HtmlElement{
htmlAttributes=[HtmlAttribute{
value='type="submit"'}
]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='حفظ'}

htmlCharDataRight=null
htmlElement=[]}
}
]}
}
]}
}]}}}}}})
export class AddPage {






constructor(svc, router) {
(this.svc = svc ? undefined : undefined);
(this.router = router ? undefined : undefined);
}
function save() {
(this.svc.
PrimaryExpression{
id='add'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ObjectDeclaration{
objectBody=
ObjectBody{
objectMemberList=[
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='name'}}}}}
ID=name}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='description'}}}}}
ID=description}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=FunctionCall{
expression=
PrimaryExpression{
id='Number'}
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='price'}}}}}]}}}}}
ID=price}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='imageUrl'}}}
operator='||'
right=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''''}}}}
ID=imageUrl}]}}}}})   ? undefined : undefined);
(this.router.
PrimaryExpression{
id='navigate'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''/list''}}}}]}}}}})   ? undefined : undefined);
}
}

@Component(
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ObjectDeclaration{
objectBody=
ObjectBody{
objectMemberList=[
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''list-page''}}}}
ID=selector}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='true'}}}}
ID=standalone}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='CommonModule'}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='RouterModule'}}}}]}}}}}
ID=imports}, 
ObjectMember{
template=Template{
htmlElements=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='ئمة المنتج'}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[AngularAttribute{
ifAttribute=IfAttribute{
ngIf = 
attributeValue='"products.length > 0"'}
]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='  '}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[]
angularAttributes=[AngularAttribute{
forAttribute=ForAttribute{
ngFor = 
attributeValue='"let p of products"'}
]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='      '}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[HtmlAttribute{
value='alt="صورة المنتج"'}
]
angularAttributes=[AngularAttribute{
ifAttribute=IfAttribute{
ngIf = 
attributeValue='"p.imageUrl"'}
, 
AngularAttribute{
bindingAttribute=BindingAttribute{
tagName='src'
attributeValue='"p.imageUrl"'}
]
htmlContent=null}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='p.name'
angularCharData=AngularCharData: {
texts: [p.name]
expression: 
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='p'}, right=
PrimaryExpression{
id='name'}}}}}}
}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='p.description'
angularCharData=AngularCharData: {
texts: [p.description]
expression: 
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='p'}, right=
PrimaryExpression{
id='description'}}}}}}
}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='{p.price'
angularCharData=AngularCharData: {
texts: [{p.price, ]
expression: 
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='p'}, right=
PrimaryExpression{
id='price'}}}}}}
}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='سع'}

htmlCharDataRight=null
htmlElement=[]}
}
]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[
AngularAttribute{
bindingAttribute=BindingAttribute{
tagName='routerLink'
attributeValue='"['/details', p.id]"'}
]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='اص'}

htmlCharDataRight=null
htmlElement=[]}
}
]}
}
]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='  '}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text=' توجد منتجا'}

htmlCharDataRight=null
htmlElement=[]}
}
]}
}
]}
}]}}}}}})
export class ListPage {


ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[]}}}}}}

constructor(svc) {
(this.svc = svc ? undefined : undefined);
(this.products = [] ? undefined : undefined);
}
function ngOnInit() {
(this.products = this.svc.
PrimaryExpression{
id='getAll'}() ? undefined : undefined);
}
}

@Component(
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ObjectDeclaration{
objectBody=
ObjectBody{
objectMemberList=[
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''details-page''}}}}
ID=selector}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='true'}}}}
ID=standalone}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='CommonModule'}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='RouterModule'}}}}]}}}}}
ID=imports}, 
ObjectMember{
template=Template{
htmlElements=[HtmlElement{
htmlAttributes=[]
angularAttributes=[AngularAttribute{
ifAttribute=IfAttribute{
ngIf = 
attributeValue='"product"'}
]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='    '}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='اصيل المن'}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[HtmlAttribute{
value='alt="صورة المنتج"'}
]
angularAttributes=[AngularAttribute{
ifAttribute=IfAttribute{
ngIf = 
attributeValue='"product.imageUrl"'}
, 
AngularAttribute{
bindingAttribute=BindingAttribute{
tagName='src'
attributeValue='"product.imageUrl"'}
]
htmlContent=null}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='product.name'
angularCharData=AngularCharData: {
texts: [product.name]
expression: 
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='product'}, right=
PrimaryExpression{
id='name'}}}}}}
}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='product.description'
angularCharData=AngularCharData: {
texts: [product.description]
expression: 
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='product'}, right=
PrimaryExpression{
id='description'}}}}}}
}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='{product.price'
angularCharData=AngularCharData: {
texts: [{product.price, ]
expression: 
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=
PrimaryExpression{
id='product'}, right=
PrimaryExpression{
id='price'}}}}}}
}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='سع'}

htmlCharDataRight=null
htmlElement=[]}
}
]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[AngularAttribute{
eventBindingAttribute=EventBindingAttribute{
tagName='click'
attributeValue='"back()"'}
]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='عودة'}

htmlCharDataRight=null
htmlElement=[]}
}
]}
}
]}
}]}}}}}})
export class DetailsPage {




constructor(route, router, svc) {
(this.route = route ? undefined : undefined);
(this.router = router ? undefined : undefined);
(this.svc = svc ? undefined : undefined);
}
function ngOnInit() {
const id = (
PrimaryExpression{
id='Number'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=DotNotation{left=DotNotation{left=DotNotation{left=DotNotation{left=
PrimaryExpression{
thisValue='this'}, right=
PrimaryExpression{
id='route'}}, right=
PrimaryExpression{
id='snapshot'}}, right=
PrimaryExpression{
id='paramMap'}}, right=FunctionCall{
expression=
PrimaryExpression{
id='get'}
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''id''}}}}]}}}}}})   ? undefined : undefined);
(this.product = this.svc.
PrimaryExpression{
id='getById'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='id'}}}}) ? undefined : undefined);
}
function back() {
(this.router.
PrimaryExpression{
id='navigate'}(
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''/list''}}}}]}}}}})   ? undefined : undefined);
}
}

@Component(
ExpressionStatement{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ObjectDeclaration{
objectBody=
ObjectBody{
objectMemberList=[
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='null'
stringValue=''app-root''}}}}
ID=selector}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='true'}}}}
ID=standalone}, 
ObjectMember{
expression=
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
ArrayDeclaration{
argumentList=
ArgumentList{
expressionList=[
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='CommonModule'}}}}, 
ConditionalExpression{
condition=
LogicalExpression{
left=
BinaryExpression{
left=
PrimaryExpression{
id='RouterModule'}}}}]}}}}}
ID=imports}, 
ObjectMember{
template=Template{
htmlElements=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='    '}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='ام إدارة المنتج'}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='      '}

htmlCharDataRight=null
htmlElement=[HtmlElement{
htmlAttributes=[HtmlAttribute{
value='routerLink="/add"'}
]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='ا'}

htmlCharDataRight=null
htmlElement=[]}
}
, HtmlElement{
htmlAttributes=[HtmlAttribute{
value='routerLink="/list"'}
]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=HtmlCharData{
text='عرض'}

htmlCharDataRight=null
htmlElement=[]}
}
]}
}
, HtmlElement{
htmlAttributes=[]
angularAttributes=[]
htmlContent=HtmlContent{htmlCharDataLeft=null
htmlCharDataRight=null
htmlElement=[]}
}
]}
}
]}
}]}}}}}})
export class AppComponent {
}

export const routes;
