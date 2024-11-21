package com.bookinventory.model;

public class BookDetails {
    // book details
    // types of books
    // price of books

   public String bookTitle;
   public String author;
   public String publisher;
   public String publicationYear;
   public String language;
   public int qty;

   @Override
   public String toString() {
      return "BookDetails{" +
              "bookTitle='" + bookTitle + '\'' +
              ", author='" + author + '\'' +
              ", publisher='" + publisher + '\'' +
              ", publicationYear='" + publicationYear + '\'' +
              ", language='" + language + '\'' +
              ", qty=" + qty +
              '}';
   }
}
