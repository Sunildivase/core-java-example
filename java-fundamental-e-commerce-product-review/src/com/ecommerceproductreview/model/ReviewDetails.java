package com.ecommerceproductreview.model;

public class ReviewDetails {

   public String  Rating;
   public String reviewText;
   public String review;

   @Override
   public String toString() {
      return "ReviewDetails{" +
              "Rating=" + Rating +
              ", reviewText='" + reviewText + '\'' +
              ", review='" + review + '\'' +
              '}';
   }
}
