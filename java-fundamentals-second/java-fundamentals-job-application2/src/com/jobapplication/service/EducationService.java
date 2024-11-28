package com.jobapplication.service;

import com.jobapplication.model.EducationDetails;

import java.util.Scanner;

public class EducationService {


    public EducationDetails acceptEducationData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter education:");
        String education = scanner.nextLine();

        System.out.println("please enter percentage: ");
        String percentage = scanner.nextLine();

        System.out.println("please enter year of passing: ");
        String yearOfPassing = scanner.nextLine();

        System.out.println("please enter university or board: ");
        String university = scanner.nextLine();

        // initial entity

        EducationDetails educationdetails = new EducationDetails();

        educationdetails.id=id;
        educationdetails.education=education;
        educationdetails.percentage=percentage;
        educationdetails.yearOfPassing=yearOfPassing;
        educationdetails.university=university;
        return educationdetails;


    }
}
