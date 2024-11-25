package com.productreview.model;

public class ProductReviewDetails {

    public int id;
    public int rating;
    public String reviewText;
    public String description;

    @Override
    public String toString() {
        return "ProductReviewDetails{" +
                "id=" + id +
                ", rating=" + rating +
                ", reviewText='" + reviewText + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
