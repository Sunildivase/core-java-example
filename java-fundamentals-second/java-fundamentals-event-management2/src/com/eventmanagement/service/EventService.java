package com.eventmanagement.service;

import com.eventmanagement.model.EventDetails;


import java.util.Scanner;

public class EventService {

    public EventDetails acceptEventData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter event name:");
        String eventName = scanner.nextLine();

        System.out.println("please enter event date:");
        String eventDate = scanner.nextLine();

        System.out.println("please enter event time:");
        String eventTime = scanner.nextLine();

        // initial entity

        EventDetails eventdetails = new EventDetails();
        eventdetails.id=id;
        eventdetails.eventName=eventName;
        eventdetails.eventDate=eventDate;
        eventdetails.eventTime=eventTime;
        return eventdetails;

    }
}
