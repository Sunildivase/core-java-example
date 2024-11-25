package com.productreview.service;

import com.productreview.model.ProductReviewDetails;

import java.util.Scanner;

public class ProductReviewService {

    public ProductReviewDetails acceptReviewData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter rating");
        int rating = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter review text");
        String reviewText = scanner.nextLine();

        System.out.println("please enter description");
        String description = scanner.nextLine();

        ProductReviewDetails reviewdetails = new ProductReviewDetails();
        reviewdetails.id= id;
        reviewdetails.rating=rating;
        reviewdetails.reviewText= reviewText;
        reviewdetails.description=description;
        return reviewdetails;




    }

}
