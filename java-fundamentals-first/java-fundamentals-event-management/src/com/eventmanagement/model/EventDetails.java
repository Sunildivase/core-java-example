package com.eventmanagement.model;

public class EventDetails {
    // segregate the project
    // event details
    // location of event
    // event organizer
    // type of event
    // Tickets of event

   public String eventName;
   public String eventDate;
   public String eventTime;
   public String budget;
   public String attendeeCount;
   public String status;
   public String description;

    @Override
    public String toString() {
        return "EventDetails{" +
                "eventName='" + eventName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", budget='" + budget + '\'' +
                ", attendeeCount='" + attendeeCount + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
