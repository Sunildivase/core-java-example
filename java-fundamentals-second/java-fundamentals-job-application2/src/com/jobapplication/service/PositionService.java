package com.jobapplication.service;

import com.jobapplication.model.PositionDetails;

import java.util.Scanner;

public class PositionService {

    public PositionDetails acceptPositionData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id=Integer.parseInt(scanner.nextLine());

        System.out.println("please enter position:");
        String position = scanner.nextLine();

        System.out.println("please enter year of experience:");
        int yearOfExperience = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter last salary:");
        int lastSalary = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter applied position:");
        String appliedPosition = scanner.nextLine();

        // initial entity

        PositionDetails positiondetails = new PositionDetails();
        positiondetails.id=id;
        positiondetails.position=position;
        positiondetails.yearOfExperience=yearOfExperience;
        positiondetails.lastSalary=lastSalary;
        positiondetails.appliedPosition=appliedPosition;
        return positiondetails;


    }
}
