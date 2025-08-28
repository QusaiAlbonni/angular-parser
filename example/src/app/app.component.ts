import { Component, Injectable } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes, Router, ActivatedRoute } from '@angular/router';


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
  private products: Product[] = [];

  getAll() {
    return this.products;
  }

  getById(id: number) {
    for (let product of this.products){
      if (product.id === id){
        return product;
      }
    }
    return null;
  }

  add(p: any) {
    const id = Date.now()
    const product = new Product(id, p.name, p.description, p.imageUrl, p.price)
    this.products.push(product)
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

      <div *ngIf="imageUrl">
        <p><strong>معاينة:</strong></p>
        <img [src]="imageUrl" alt="صورة المنتج" />
      </div>

      <button type="submit">حفظ</button>
    </form>
  `
})
export class AddPage {
  name: string;
  description: string;
  price: number;
  imageUrl: string;

  private svc: ProductService;
  private router: Router;

  constructor(svc: ProductService, router: Router) {
    this.svc = svc
    this.router = router
  }

  save(){
    this.svc.add({
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

    <ng-template>
      <p>لا توجد منتجات.</p>
    </ng-template>
  `
})
export class ListPage {
  products: Product[];

  private svc: ProductService;

  constructor(svc: ProductService) {
    this.svc = svc
    this.products = []
  }

  ngOnInit() {
    this.products = this.svc.getAll();
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

    <ng-template>
      <p>المنتج غير موجود.</p>
    </ng-template>
  `
})
export class DetailsPage {
  product: Product;

  private route: ActivatedRoute;
  private router: Router;
  private svc: ProductService;

  constructor(route: ActivatedRoute, router: Router, svc: ProductService) {
    this.route = route
    this.router = router
    this.svc = svc;
  }

  ngOnInit() {
    const id = Number(this.route.snapshot.paramMap.get('id'))
    this.product = this.svc.getById(id)
  }

  back() {
    this.router.navigate(['/list']);
  }
}
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

export const routes: Routes = [
  { path: '', redirectTo: 'list', pathMatch: 'full' },
  { path: 'add', component: AddPage },
  { path: 'list', component: ListPage },
  { path: 'details/:id', component: DetailsPage }
];
