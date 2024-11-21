package com.jobapplication.model;

public class AddressDetails {
    public String city;
    public String state;
    public int zip;

    @Override
    public String toString() {
        return "AddressDetails{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                '}';
    }
}
