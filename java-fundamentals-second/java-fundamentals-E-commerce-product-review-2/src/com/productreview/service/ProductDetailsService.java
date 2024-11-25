package com.productreview.service;

import com.productreview.model.ProductDetails;

import java.util.Scanner;

public class ProductDetailsService {

    public ProductDetails acceptProductData() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int id =Integer.parseInt(scanner.nextLine());

        System.out.println("please enter product name");
        String productName = scanner.nextLine();

        System.out.println("please enter color");
        String color = scanner.nextLine();

        System.out.println("please enter brand");
        String brand = scanner.nextLine();

        System.out.println("please enter price");
        double price =scanner.nextDouble();

        // initial entity

        ProductDetails productdetails = new ProductDetails();
        productdetails.id = id;
        productdetails.productName = productName;
        productdetails.color = color;
        productdetails.brand = brand;
        productdetails.price = price;
        return productdetails;


    }
}
