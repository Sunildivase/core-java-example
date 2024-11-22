package com.eventmanagement.service;

import com.eventmanagement.model.*;

import java.util.Scanner;

public class EventManagementSystem {

    public static void main(String[] args) {

        // create scanner for event details

        Scanner scanner = new Scanner(System.in);

        System.out.println("please select event: ");
        String eventName = scanner.nextLine();

        System.out.println(" please select event date: ");
        String eventDate = scanner.nextLine();

        System.out.println(" please select event time: ");
        String eventTime = scanner.nextLine();

        System.out.println("please select your budget ");
        String budget = scanner.nextLine();

        System.out.println("total guest attendee: ");
        String attendeeCount = scanner.nextLine();

        System.out.println("please enter status of event: ");
        String status = scanner.nextLine();

        System.out.println("please enter description of event: ");
        String description = scanner.nextLine();

        EventDetails eventdetails = new EventDetails();
        eventdetails.eventName = eventName;
        eventdetails.eventDate = eventDate;
        eventdetails.eventTime = eventTime;
        eventdetails.budget = budget;
        eventdetails.attendeeCount = attendeeCount;
        eventdetails.status = status;
        eventdetails.description = description;

        System.out.println("event details submitted successfully: " + eventdetails);

        // create scanner for event location

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("please enter landmark: ");
        String landmark = scanner1.nextLine();

        System.out.println(" please enter city: ");
        String city = scanner1.nextLine();

        System.out.println(" please enter state: ");
        String state = scanner1.nextLine();

        System.out.println(" please enter pin: ");
        String pin = scanner1.nextLine();

        System.out.println("capacity of venue: ");
        String capacity = scanner1.nextLine();

        EventVenue eventvenue = new EventVenue();
        eventvenue.landmark = landmark;
        eventvenue.city = city;
        eventvenue.state = state;
        eventvenue.pin = pin;
        eventvenue.capacity = capacity;

        System.out.println("event location details submitted successfully: " + eventvenue);

        // create scanner for type of event

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("please select type of event: ");
        String typeOfEvent = scanner2.nextLine();

        TypeOfEvent eventtype = new TypeOfEvent();
        eventtype.typeOfEvent = typeOfEvent;

        System.out.println(" type of event selected successfully: " + eventtype);

        // create scanner for organizer details

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("please enter organizerName: ");
        String organizerName = scanner3.nextLine();

        System.out.println("please enter contact number: ");
        String contactNo = scanner3.nextLine();

        System.out.println("please enter email id: ");
        String emailId = scanner3.nextLine();

        OrganizerDetails organizer = new  OrganizerDetails();
        organizer.organizerName = organizerName;
        organizer.contactNo = contactNo;
        organizer.emailId = emailId;

        System.out.println("organizer details submitted successfully: " + organizer);

        // create scanner for tickets

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("price: ");
        String price = scanner4.nextLine();

        System.out.println("available Tickets: ");
        String availableTickets = scanner4.nextLine();

        Tickets tickets = new Tickets();
        tickets.price = price;
        tickets.availableTickets = availableTickets;

        System.out.println("ticket information submitted successfully: " + tickets);

    }
}
