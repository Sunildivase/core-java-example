package com.eventmanagement.model;

public class OrganizerDetails {

   public String organizerName;
   public String contactNo;
   public String emailId;

   @Override
   public String toString() {
      return "OrganizerDetails{" +
              "organizerName='" + organizerName + '\'' +
              ", contactNo='" + contactNo + '\'' +
              ", emailId='" + emailId + '\'' +
              '}';
   }
}
