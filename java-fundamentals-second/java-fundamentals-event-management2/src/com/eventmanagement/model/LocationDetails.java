package com.eventmanagement.model;

public class LocationDetails {

    public int id;
    public String Venue;
    public String city;
    public int pin;

    @Override
    public String toString() {
        return "LocationDetails{" +
                "id=" + id +
                ", Venue='" + Venue + '\'' +
                ", city='" + city + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
