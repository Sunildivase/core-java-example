package com.studentregistration.service;

import com.studentregistration.model.FeeDetails;

import java.util.Scanner;

public class FeeDetailsService {

    public FeeDetails acceptFeeData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter course fee");
        String fee = scanner.nextLine();

        //initial entity

        FeeDetails feedetails = new FeeDetails();
        feedetails.id=id;
        feedetails.fee=fee;
        return feedetails;



    }
}
