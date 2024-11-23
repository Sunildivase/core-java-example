package com.jobapplication.model;

public class Experience {

   public String employerName;
   public String address;
   public String position;
   public String reasonForLeaving;
   public int lastSalaryDrawn;

   @Override
   public String toString() {
      return "Experience{" +
              "employerName='" + employerName + '\'' +
              ", address='" + address + '\'' +
              ", position='" + position + '\'' +
              ", reasonForLeaving='" + reasonForLeaving + '\'' +
              ", lastSalaryDrawn=" + lastSalaryDrawn +
              '}';
   }
}
