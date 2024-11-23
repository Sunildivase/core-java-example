package com.studentregistration.model;

public class AddressDetails {

   public String houseNo;
   public  String landmark;
   public  String city;
   public  String district;
   public String state;
   public int pin;

    @Override
    public String toString() {
        return "AddressDetails{" +
                "houseNo='" + houseNo + '\'' +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
