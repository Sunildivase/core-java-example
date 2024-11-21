package com.bookinventory.service;

import com.bookinventory.model.BookDetails;
import com.bookinventory.model.PriceAndAuthorDetails;
import com.bookinventory.model.TypesOfBook;

import java.util.Scanner;

public class BookInventoryDemo {

    public static void main(String[] args) {


    // we create scanner for book details

    Scanner scanner = new Scanner(System.in);

        System.out.println("select book: ");
        String bookTitle = scanner.nextLine();

        System.out.println("select author: ");
        String author = scanner.nextLine();

        System.out.println("select publisher: ");
        String publisher = scanner.nextLine();

        System.out.println("select publicationYear: ");
        String publicationYear = scanner.nextLine();

        System.out.println("select language: ");
        String language = scanner.nextLine();

        System.out.println("select quantity: ");
        int qty = scanner.nextInt();

        BookDetails bookdetails = new BookDetails();
        bookdetails.bookTitle = bookTitle;
        bookdetails.author = author;
        bookdetails.publisher = publisher;
        bookdetails.publicationYear = publicationYear;
        bookdetails.language = language;
        bookdetails.qty = qty;

        System.out.println(" book details received: " + bookdetails);

        Scanner scanner1 =new Scanner(System.in);

        System.out.println("price of book: ");
        int price = scanner1.nextInt();

        System.out.println("total books: ");
        int totalBook = scanner1.nextInt();

        System.out.println("total author: ");
        int totalAuthor = scanner1.nextInt();

        PriceAndAuthorDetails priceandauthordetails = new PriceAndAuthorDetails();
        priceandauthordetails.price = price;
        priceandauthordetails.totalBook = totalBook;
        priceandauthordetails.totalAuthor = totalAuthor;

        System.out.println("price and author details: " + priceandauthordetails);

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("select book type: ");
        String bookType = scanner2.nextLine();

        TypesOfBook typesofbook = new TypesOfBook();
        typesofbook.bookType = bookType;

        System.out.println("type of book details: " + typesofbook);

    }

}
