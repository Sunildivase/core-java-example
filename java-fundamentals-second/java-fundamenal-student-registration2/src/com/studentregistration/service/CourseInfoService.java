package com.studentregistration.service;

import com.studentregistration.model.CourseInfo;

import java.util.Scanner;

public class CourseInfoService {

    public CourseInfo acceptCourseData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter course name: ");
        String courseName = scanner.nextLine();

        System.out.println("please enter course duration: ");
        String courseDuration = scanner.nextLine();

        System.out.println("please enter course start date: ");
        String startDate = scanner.nextLine();

        // initial entity

        CourseInfo coursedetails = new CourseInfo();
        coursedetails.id=id;
        coursedetails.courseName=courseName;
        coursedetails.courseDuration=courseDuration;
        coursedetails.startDate=startDate;
        return coursedetails;



    }
}
