package com.jobapplication.service;

import com.jobapplication.model.*;

import java.util.Scanner;

public class JobApplicationForm {

    public static void main(String[] args) {

        // we create scanner for personal information

        Scanner scanner =new Scanner(System.in);

        System.out.println("please enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("please enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("please enter last name: ");
        String lastname = scanner.nextLine();

        System.out.println("please enter contact number: ");
        String contactNo = scanner.nextLine();

        System.out.println("please enter Email address: ");
        String emailId = scanner.nextLine();

        PersonalInformation personalinformation = new PersonalInformation();
        personalinformation.firstName = firstName;
        personalinformation.middleName = middleName;
        personalinformation.lastName = lastname;
        personalinformation.contactNo = contactNo;
        personalinformation.emailId = emailId;

        System.out.println("personal information successfully submitted: " + personalinformation);

        // create scanner for address details

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("please enter city: ");
        String city = scanner1.nextLine();

        System.out.println("please enter state: ");
        String state = scanner1.nextLine();

        System.out.println("please enter pin: ");
        int zip = scanner1.nextInt();

        AddressDetails addressdetails = new AddressDetails();
        addressdetails.city = city;
        addressdetails.state = state;
        addressdetails.zip =zip;

        System.out.println("address details submitted successfully: " + addressdetails);

        // create scanner for employment desired position and salary expectation

        Scanner scanner2 =new Scanner(System.in);

        System.out.println("position applied for: ");
        String positionAppliedFor = scanner2.nextLine();

        System.out.println("date of available: ");
        String dateOfAvailable = scanner2.nextLine();

        System.out.println("salary expectation: ");
        int desiredSalary = scanner2.nextInt();

        EmploymentDesired employment = new EmploymentDesired();
        employment.positionAppliedFor= positionAppliedFor;
        employment.dateOfAvailable=dateOfAvailable;
        employment.desiredSalary=desiredSalary;

        System.out.println("expectation and postion details submitted succefully: " + employment);

        // create scanner for education details

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("please enter school or university name: ");
        String schoolOrUniversityName = scanner3.nextLine();

        System.out.println("please enter percentage :");
        String percentage = scanner3.nextLine();

        System.out.println("please enter year of passing: ");
        String yearOfPassing = scanner3.nextLine();

        EducationHistory education = new EducationHistory();
        education.schoolOrUniversityName = schoolOrUniversityName;
        education.percentage = percentage;
        education.yearOfPassing = yearOfPassing;

        System.out.println("education details submitted successfully: " + education);

        // create scanner for experience

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("please enter last employer name: ");
        String employerName = scanner4.nextLine();

        System.out.println("please enter address: ");
        String address = scanner4.nextLine();

        System.out.println("please enter last postion: ");
        String position = scanner4.nextLine();

        System.out.println("please enter reason for leaving: ");
        String reasonForLeaving = scanner4.nextLine();

        System.out.println("please enter last salary drawn: ");
        int lastSalaryDrawn = scanner4.nextInt();

        Experience experience = new Experience();
        experience.employerName = employerName;
        experience.address = address;
        experience.position = position;
        experience.reasonForLeaving = reasonForLeaving;
        experience.lastSalaryDrawn = lastSalaryDrawn;

        System.out.println("experience details submitted successfully: " + experience);

        // create scanner for reference

        Scanner scanner5 = new Scanner(System.in);

        System.out.println("please enter reference person name: ");
        String name = scanner5.nextLine();

        System.out.println("please enter position: ");
        String title = scanner5.nextLine();

        System.out.println("please enter company name: ");
        String company = scanner5.nextLine();

        System.out.println("please enter phone number: ");
        String phone = scanner5.nextLine();

        References references = new References();
        references.name = name;
        references.title = title;
        references.company = company;
        references.phone = phone;

        System.out.println("reference details submitted successfully: " + references);


    }
}
