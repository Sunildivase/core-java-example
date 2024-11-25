package com.productreview.model;

public class ProductDetails {
    public int id;
    public String productName;
    public String color;
    public String brand;
    public double price;

    @Override
    public String toString() {
        return "ProductDetails{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
