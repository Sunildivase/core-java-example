package com.ecommerceproductreview.service;

import com.ecommerceproductreview.model.ProductDetails;
import com.ecommerceproductreview.model.ReviewDetails;

import java.util.Scanner;

public class ProductReviewDetails {

    public static void main(String[] args) {

     // create scanner for product details

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter product name: ");
        String productName = scanner.nextLine();

        System.out.println("please enter category: ");
        String category = scanner.nextLine();

        System.out.println("please enter price: ");
        String price = scanner.nextLine();

        System.out.println("please select brand: ");
        String brand = scanner.nextLine();

        System.out.println("please select color: ");
        String color = scanner.nextLine();

        System.out.println("please select offers: ");
        String offers = scanner.nextLine();

        System.out.println("discount:");
        String discount = scanner.nextLine();

        System.out.println("features: ");
        String features = scanner.nextLine();

        ProductDetails productdetails = new ProductDetails();
        productdetails.productName = productName;
        productdetails.category = category;
        productdetails.price = price;
        productdetails.brand = brand;
        productdetails.color = color;
        productdetails.offers = offers;
        productdetails.discount = discount;
        productdetails.features = features;

        System.out.println("product details submitted successfully: " + productdetails);

        // create scanner for product review

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("please enter rating of product ");
        String  rating = scanner1.nextLine();

        System.out.println("please enter reviewText: ");
        String reviewText = scanner1.nextLine();

        System.out.println("please enter review of product: ");
        String review =scanner1.nextLine();

        ReviewDetails reviewdetails = new ReviewDetails();
        reviewdetails.Rating = rating;
        reviewdetails.reviewText = reviewText;
        reviewdetails.review = review;

        System.out.println("product review submitted successfully: " + reviewdetails);


    }
}
