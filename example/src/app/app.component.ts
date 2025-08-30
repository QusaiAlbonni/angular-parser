import { Component, Injectable } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes, Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterModule],
  template: `
    <div>
      <h1>نظام إدارة المنتجات</h1>
      <nav>
        <a routerLink="/add">إضافة</a>
        <a routerLink="/list">عرض</a>
      </nav>
      <router-outlet></router-outlet>
    </div>
  `
})
export class AppComponent {}

class Product {
  id: number;
  name: string;
  description: string;
  imageUrl: string;
  price: number;

  constructor(id: number, name: string, description: string, imageUrl: string, price: number) {
    this.id = id
    this.name = name
    this.description = description
    this.imageUrl = imageUrl
    this.price = price
  }
}

@Injectable({ providedIn: 'root' })
export class ProductService {
  private storageKey: string;
  private counterKey: string;

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

  saveProducts(products : any){
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

  getById(id: number){
    const products = this.getProducts()
    for (let p of products) {
      if (p.id === id) {
        return p
      }
    }
    return null
  }

  add(p: any){
    const products = this.getProducts()
    const id = this.getCounter()
    const product = new Product(id, p.name, p.description, p.imageUrl, p.price)
    products.push(product)
    this.saveProducts(products)
    this.incrementCounter()
  }
}

@Component({
  selector: 'add-page',
  standalone: true,
  imports: [CommonModule, FormsModule, RouterModule],
  template: `
    <h2>إضافة منتج</h2>

    <form (ngSubmit)="save()">
      <input [(ngModel)]="name" name="name" placeholder="اسم المنتج" required />
      <input [(ngModel)]="description" name="description" placeholder="الوصف" required />
      <input [(ngModel)]="price" name="price" type="number" placeholder="السعر" required />
      <input [(ngModel)]="imageUrl" name="imageUrl" placeholder="رابط الصورة" />

      <button type="submit">حفظ</button>
    </form>
  `
})
export class AddPage {
  name: string;
  description: string;
  price: number;
  imageUrl: string;

  private productService: ProductService;
  private router: Router;

  constructor(productService: ProductService, router: Router) {
    this.productService = productService
    this.router = router
    this.name= '';
    this.description= '';
    this.price = 0;
    this.imageUrl= '';
  }

  save(){
    this.productService.add({
      name: this.name,
      description: this.description,
      price: Number(this.price),
      imageUrl: this.imageUrl || ''
    })
    this.router.navigate(['/list']);
  }
}


@Component({
  selector: 'list-page',
  standalone: true,
  imports: [CommonModule, RouterModule],
  template: `
    <h2>قائمة المنتجات</h2>

    <div *ngIf="products.length > 0">
      <div *ngFor="let p of products">
        <img *ngIf="p.imageUrl" [src]="p.imageUrl" alt="صورة المنتج" />
        <h3>{{ p.name }}</h3>
        <p>{{ p.description }}</p>
        <p><strong>السعر:</strong> {{ p.price }}</p>
        <a [routerLink]="['/details', p.id]">تفاصيل</a>
      </div>
    </div>

  `
})
export class ListPage {
  products: Product[];

  private productService: ProductService;

  constructor(productService: ProductService) {
    this.productService = productService
    this.products = []
  }

  ngOnInit() {
    this.products = this.productService.getAll();
  }
}

@Component({
  selector: 'details-page',
  standalone: true,
  imports: [CommonModule, RouterModule],
  template: `
    <div *ngIf="product">
      <h2>تفاصيل المنتج</h2>
      <img *ngIf="product.imageUrl" [src]="product.imageUrl" alt="صورة المنتج" />
      <h3>{{ product.name }}</h3>
      <p>{{ product.description }}</p>
      <p><strong>السعر:</strong> {{ product.price }}</p>
      <button (click)="back()">عودة</button>
    </div>
  `
})
export class DetailsPage {
  product: Product;

  private ActivatedRoute: ActivatedRoute;
  private router: Router;
  private productService: ProductService;

  constructor(ActivatedRoute: ActivatedRoute, router: Router, productService: ProductService) {
    this.ActivatedRoute = ActivatedRoute
    this.router = router
    this.productService = productService;
  }

  ngOnInit() {
    const id = Number(this.ActivatedRoute.snapshot.paramMap.get('id'))
    this.product = this.productService.getById(id)
  }

  back() {
    this.router.navigate(['/list']);
  }
}


export const routes = [
  { path: '', redirectTo: 'list', pathMatch: 'full' },
  { path: 'add', component: AddPage },
  { path: 'list', component: ListPage },
  { path: 'details/:id', component: DetailsPage }
];
