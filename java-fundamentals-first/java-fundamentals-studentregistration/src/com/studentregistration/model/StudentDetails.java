package com.studentregistration.model;

public class StudentDetails {

    // create class for every specific data
    // student details
    // address details
   // course details
  //  fee details

  public   String firstName;
  public   String middleName;
  public   String lastName;
  public   String gender;
  public   String emailId;
  public   String contactNo;
  public   String dateOfBirth;

    @Override
    public String toString() {
        return "StudentDetails{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", emailId='" + emailId + '\'' +
                ", contactNo=" + contactNo +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}