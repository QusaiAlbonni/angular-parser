//app.component.ts
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
selector: 'app-root',
standalone: true,
imports: [CommonModule],
template: `
<div class="container">
<div class="product-list">
<div
class="product"
*ngFor="let product of products"
[class.selected]="product === selectedProduct"
(click)="selectProduct(product)"
>
<h4>{{ product.name }}</h4>
<img [src]="product.image" alt="Product Image" class="product-image" />
</div>
</div>
<div class="product-detail" *ngIf="selectedProduct">
<h3>{{ selectedProduct.name }}</h3>
<img
[src]="selectedProduct.image"
alt="Product Image"
class="detail-image"
/>
<p>{{ selectedProduct.details }}</p>
</div>
</div>
`,
styles: [
`
.container {
display: flex;
flex-wrap: wrap;
padding: 20px;
background-color: #f9f9f9;
border-radius: 8px;
box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        gap: 20px;
      }

      .product-list {
        flex: 1;
        display: flex;
        flex-direction: column;
        gap: 15px;
        min-width: 250px;
      }

      .product {
        border: 1px solid #ddd;
        border-radius: 8px;
        padding: 15px;
        cursor: pointer;
        background-color: #fff;
        transition: transform 0.2s, box-shadow 0.2s, border-color 0.2s;
        display: flex;
        flex-direction: column;
        align-items: center;
      }

      .product:hover {

        transform: translateY(-3px);
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        border-color: #007bff;
      }

      .product.selected {

        border-color: #007bff;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
      }

      .product-image {
        width: 100%;
        max-width: 120px;
        height: auto;
        border-radius: 5px;
        margin-top: 10px;
      }

      .product-detail {
        flex: 2;
        padding: 20px;
        background-color: #fff;
        border: 1px solid #007bff;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        min-width: 250px;

      }

      .detail-image {
        width: 100%;
        max-width: 300px;
        height: auto;
        border-radius: 8px;
        margin-bottom: 20px;
      }

      h3 {
        margin: 0 0 15px 0;
        color: #333;
      }

      p {
        color: #555;
        line-height: 1.6;
      }

      /* Responsive Design */
      @media (max-width: 768px) {
        .container {
          flex-direction: column;
        }

        .product-list {
          flex-direction: row;
          flex-wrap: wrap;
          gap: 10px;
          justify-content: center;
        }

        .product {
          flex: 0 1 45%;
        }


        .product-detail {
          margin-top: 20px;
        }
      }
    `,
  ],
})
export class AppComponent {
  products = [
    {
      name: 'Product 1',
      image: 'https://media.istockphoto.com/id/2174290339/nl/foto/neural-network-nodes-deep-learning-artificial-intelligence-machine-learning-model.jpg?s=1024x1024&w=is&k=20&c=54EHvVjklD4CTzZKb9XXSw4-28sxuqlexAjr_eTts_o=',
      details: 'Visual Elements:A large web of interconnected nodes, possibly symbolizing data points or user connections.A glowing, tech-inspired color palette, featuring blues and purples.Icons or symbols of cloud computing, AI, or IoT.Layers of abstract design to convey depth and complexity in data or technology.Potential Use Cases:Technology presentations or discussions about cloud computing, AI, or IoT.Marketing material for software, IT services, or tech solutions.',
    },
    {
      name: 'Product 2',
      image: 'https://media.istockphoto.com/id/1132150631/nl/foto/social-media-platform-informatietechnologie-big-data-cloud-computing-ai-iot.jpg?s=1024x1024&w=is&k=20&c=sOhZ_4hJpdx9FxuEqEp5R-D43aX22-1cJ5TZqrgw31g=',
      details: 'Theme: Online Dating and Social Media NetworkingVisuals:Displays a conceptual design of connected icons forming a network.Includes symbols representing relationships, social interaction, and messaging (e.g., hearts, people, chat bubbles).',
    },
    {
      name: 'Product 3',
      image: 'https://media.istockphoto.com/id/1894107670/nl/foto/electricity.jpg?s=612x612&w=0&k=20&c=R_9ENN2UEe8bqUgAiHfgynoAhO1jBEk9Kgc9J_WKwhQ=',
      details: 'Theme: Electricity/PowerVisualsDepicts a glowing light bulb surrounded by electric currents or sparks of energy.The background is dark, enhancing the vibrant blue and white electric arcs.Symbolizes innovation, energy, or the concept of power and electricity.',
    },
  ]

  // Initialize selectedProduct with the first product
  selectedProduct = this.products[0];

  selectProduct(product: any) {
    this.selectedProduct = product;
  }
}
