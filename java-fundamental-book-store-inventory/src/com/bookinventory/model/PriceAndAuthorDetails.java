package com.bookinventory.model;

public class PriceAndAuthorDetails {
   public int price;
   public int totalBook;
   public int totalAuthor;

   @Override
   public String toString() {
      return "PriceAndAuthorDetails{" +
              "price=" + price +
              ", totalBook=" + totalBook +
              ", totalAuthor=" + totalAuthor +
              '}';
   }
}
