package com.eventmanagement.service;

import com.eventmanagement.model.BookingDetails;

import java.util.Scanner;

public class BookingService {

    public BookingDetails acceptBookingData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter event type:");
        String eventType = scanner.nextLine();

        System.out.println("please select capacity:");
        int capacity = Integer.parseInt(scanner.nextLine());

        System.out.println("available seats:");
        int availableSeats = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter price:");
        int price = Integer.parseInt(scanner.nextLine());

        // initial entity

        BookingDetails bookingdetails = new BookingDetails();
        bookingdetails.id = id;
        bookingdetails.eventType=eventType;
        bookingdetails.capacity=capacity;
        bookingdetails.availableSeats=availableSeats;
        bookingdetails.price=price;
        return bookingdetails;


    }
}
