package com.eventmanagement.model;

public class EventVenue {

   public String landmark;
   public String city;
   public String state;
   public String pin;
   public String capacity;

   @Override
   public String toString() {
      return "EventVenue{" +
              "landmark='" + landmark + '\'' +
              ", city='" + city + '\'' +
              ", state='" + state + '\'' +
              ", pin='" + pin + '\'' +
              ", capacity='" + capacity + '\'' +
              '}';
   }
}
