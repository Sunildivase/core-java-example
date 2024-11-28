package com.eventmanagement.service;

import com.eventmanagement.model.LocationDetails;


import java.util.Scanner;

public class LocationService {

    public LocationDetails acceptLocationData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter venue:");
        String venue = scanner.nextLine();

        System.out.println("please enter city:");
        String city = scanner.nextLine();

        System.out.println("please enter pin:");
        int pin = Integer.parseInt(scanner.nextLine());

        // initial entity

        LocationDetails locationdetails = new LocationDetails();
        locationdetails.id=id;
        locationdetails.Venue=venue;
        locationdetails.city=city;
        locationdetails.pin=pin;
        return locationdetails;


    }
}