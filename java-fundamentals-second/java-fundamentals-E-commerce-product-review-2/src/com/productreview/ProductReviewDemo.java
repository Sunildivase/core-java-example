package com.productreview;

import com.productreview.model.ProductDetails;
import com.productreview.model.ProductReviewDetails;
import com.productreview.model.UserDetails;
import com.productreview.service.ProductDetailsService;
import com.productreview.service.ProductReviewService;
import com.productreview.service.UserDetailsService;

public class ProductReviewDemo {

    public static void main(String[] args) {

        System.out.println("*** E-commerce-product-review ***");

        UserDetailsService userservice = new UserDetailsService();
        UserDetails userdetails = userservice.acceptUserData();

        ProductReviewService productreviewservice =new ProductReviewService();
        ProductReviewDetails reviewdetails = productreviewservice.acceptReviewData();

        ProductDetailsService productservice = new ProductDetailsService();
        ProductDetails productdetails =  productservice.acceptProductData();


        // completed all processing

        // print the data

        System.out.println(" product details "+ productdetails) ;
        System.out.println("user details " + userdetails );
        System.out.println("product review " + reviewdetails);
    }

}
