package com.persondetails.model;

public class AddressDetails {
   public String houseNoBuildingName;
   public String landmark;
   public String city;
   public String tehsil;
   public String district;
   public String state;
   public int pin;

   // This is used for shows the output result:-

   @Override
   public String toString() {
      return "AddressDetails{" +
              "houseNoBuildingName='" + houseNoBuildingName + '\'' +
              ", landmark='" + landmark + '\'' +
              ", city='" + city + '\'' +
              ", tehsil='" + tehsil + '\'' +
              ", district='" + district + '\'' +
              ", state='" + state + '\'' +
              ", pin=" + pin +
              '}';
   }
}
