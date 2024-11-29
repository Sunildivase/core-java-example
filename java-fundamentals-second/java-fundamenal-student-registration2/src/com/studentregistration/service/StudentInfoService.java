package com.studentregistration.service;

import com.studentregistration.model.StudentInfo;

import java.util.Scanner;

public class StudentInfoService {

    public StudentInfo acceptStudentData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first name:");
        String fName = scanner.nextLine();

        System.out.println("please enter lName:");
        String lName = scanner.nextLine();

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contact no:");
        long contactNo = Long.parseLong(scanner.nextLine());

        System.out.println("please enter email id:");
        String emailId = scanner.nextLine();

        // initial entity

        StudentInfo studentdetails =new StudentInfo();
        studentdetails.id=id;
        studentdetails.fName=fName;
        studentdetails.lName=lName;
        studentdetails.gender=gender;
        studentdetails.contactNo=contactNo;
        studentdetails.emailId=emailId;
        return studentdetails;


    }
}
