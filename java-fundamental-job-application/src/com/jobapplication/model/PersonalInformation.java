package com.jobapplication.model;

public class PersonalInformation {
    // we create job application
    // we need employee personal details
    // Address details
    // Education details
    // Experience
    // EmploymentDesired which means which position and salary
    // references

   public String firstName;
   public String middleName;
   public String lastName;
   public String contactNo;
   public String emailId;

   @Override
   public String toString() {
      return "PersonalInformation{" +
              "firstName='" + firstName + '\'' +
              ", middleName='" + middleName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", contactNo='" + contactNo + '\'' +
              ", emailId='" + emailId + '\'' +
              '}';
   }
}
