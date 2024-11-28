package com.eventmanagement.model;

public class BookingDetails {

    public int id;
    public String eventType;
    public int capacity;
    public int availableSeats;
    public int price;

    @Override
    public String toString() {
        return "BookingDetails{" +
                "id=" + id +
                ", eventType='" + eventType + '\'' +
                ", capacity='" + capacity + '\'' +
                ", availableSeats='" + availableSeats + '\'' +
                ", price=" + price +
                '}';
    }
}
