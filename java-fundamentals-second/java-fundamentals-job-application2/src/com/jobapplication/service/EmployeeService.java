package com.jobapplication.service;

import com.jobapplication.model.EmployeeDetails;

import java.util.Scanner;

public class EmployeeService {

    public EmployeeDetails acceptEmployeeData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter employee name:");
        String employeeName = scanner.nextLine();

        System.out.println("please enter gender: ");
        String gender = scanner.nextLine();

        System.out.println("please enter contact number: ");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email id:");
        String emailId = scanner.nextLine();

     //  initial entity

        EmployeeDetails employeedetails = new EmployeeDetails();
        employeedetails.id = id;
        employeedetails.employeeName = employeeName;
        employeedetails.gender =gender;
        employeedetails.contactNo = contactNo;
        employeedetails.emailId=emailId;
        return employeedetails;


    }
}
