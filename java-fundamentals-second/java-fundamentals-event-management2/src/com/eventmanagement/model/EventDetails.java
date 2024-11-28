package com.eventmanagement.model;

public class EventDetails {

    public int id;
    public String eventName;
    public String eventDate;
    public String eventTime;

    @Override
    public String toString() {
        return "EventDetails{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventTime='" + eventTime + '\'' +
                '}';
    }
}
