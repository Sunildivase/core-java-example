package com.studentregistration.service;

import com.studentregistration.model.AddressDetails;
import com.studentregistration.model.CourseDetails;
import com.studentregistration.model.FeeDetails;
import com.studentregistration.model.StudentDetails;

import java.util.Scanner;

public class StudentRegistrationForm {

    public static void main(String[] args) {

        //  we create scanner for student personal details

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter first name: ");
        String firstname = scanner.nextLine();

        System.out.println("please enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("please enter last name: ");
        String lastName =scanner.nextLine();

        System.out.println("select your gender: ");
        String gender = scanner.nextLine();

        System.out.println("please enter email address: ");
        String emailId =scanner.nextLine();

        System.out.println("please enter contact number: ");
        String contactNo = scanner.nextLine();

        System.out.println("please enter date of birth: ");
        String dateOfBirth = scanner.nextLine();

        StudentDetails studentdetails = new StudentDetails();
        studentdetails.firstName=firstname;
        studentdetails.middleName=middleName;
        studentdetails.lastName=lastName;
        studentdetails.gender=gender;
        studentdetails.emailId=emailId;
        studentdetails.contactNo=contactNo;
        studentdetails.dateOfBirth=dateOfBirth;

        System.out.println("student details submitted successfully :" + studentdetails);

        // we create scanner for address details of student

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("please enter houseno: ");
        String houseNo = scanner1.nextLine();

        System.out.println("please enter landmark: ");
        String landmark = scanner1.nextLine();

        System.out.println("please enter city: ");
        String city = scanner1.nextLine();

        System.out.println("please enter district: ");
        String district = scanner1.nextLine();

        System.out.println("please enter state: ");
        String state = scanner1.nextLine();

        System.out.println("please enter pin: ");
        int pin = scanner1.nextInt();

        AddressDetails addressdetails = new AddressDetails();
        addressdetails.houseNo = houseNo;
        addressdetails.landmark = landmark;
        addressdetails.city = city;
        addressdetails.district = district;
        addressdetails.state = state;
        addressdetails.pin = pin;

        System.out.println(" address details submitted successfully : " + addressdetails );

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("please enter course name: ");
        String courseName = scanner2.nextLine();

        System.out.println("please enter course duration: ");
        String courseDuration = scanner2.nextLine();

        CourseDetails coursedetails = new CourseDetails();
        coursedetails.courseName = courseName;
        coursedetails.courseDuration =courseDuration;

        System.out.println("course details submitted successfully: " + coursedetails);

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("please select course fee: ");
        int courseFee = scanner3.nextInt();

        FeeDetails feedetails = new FeeDetails();

        feedetails.courseFee = courseFee;

        System.out.println(" fee details selected successfully: " + feedetails);


    }

}
