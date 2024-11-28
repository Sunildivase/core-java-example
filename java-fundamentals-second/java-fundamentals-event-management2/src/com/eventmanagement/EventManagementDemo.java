package com.eventmanagement;

import com.eventmanagement.model.BookingDetails;
import com.eventmanagement.model.EventDetails;
import com.eventmanagement.model.LocationDetails;
import com.eventmanagement.service.BookingService;
import com.eventmanagement.service.EventService;
import com.eventmanagement.service.LocationService;

public class EventManagementDemo {

    public static void main(String[] args) {

        System.out.println("*** Event Management ***");

        EventService  eventservice = new EventService();
        EventDetails eventdetails =eventservice.acceptEventData();

        BookingService bookingservice = new BookingService();
        BookingDetails bookingdetails = bookingservice.acceptBookingData();

        LocationService locationservice = new LocationService();
        LocationDetails locationdetails = locationservice.acceptLocationData();

        //all process complete
        // print

        System.out.println("event details: "+eventdetails);
        System.out.println("booking details: " +bookingdetails);
        System.out.println("location details :"+ locationdetails);
    }
}
