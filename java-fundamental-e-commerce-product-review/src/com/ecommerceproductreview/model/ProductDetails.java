package com.ecommerceproductreview.model;

public class ProductDetails {

    // segregate the project
    // product details
    // review details

   public String productName;
   public String category;
   public String price;
   public String brand;
   public String color;
   public String offers;
   public String discount;
   public String features;

   @Override
   public String toString() {
      return "ProductDetails{" +
              "productName='" + productName + '\'' +
              ", category='" + category + '\'' +
              ", price='" + price + '\'' +
              ", brand='" + brand + '\'' +
              ", color='" + color + '\'' +
              ", offers='" + offers + '\'' +
              ", discount='" + discount + '\'' +
              ", features='" + features + '\'' +
              '}';
   }
}
