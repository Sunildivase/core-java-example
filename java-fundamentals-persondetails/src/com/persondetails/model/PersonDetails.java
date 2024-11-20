package com.persondetails.model;
// create class for every specific data
// creating form and segregate the specific classes
// person details
// address details
// income details
// scheme details
public class PersonDetails {
   public String firstName;
   public String lastName;
   public int age;

   // This is used for shows the output result:-

   @Override
   public String toString() {
      return "PersonDetails{" +
              "firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", age=" + age +
              '}';
   }
}
