package com.productreview.service;

import com.productreview.model.UserDetails;

import java.util.Scanner;

public class UserDetailsService {

    public UserDetails acceptUserData(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter user name");
        String userName = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        UserDetails userdetails = new UserDetails();
        userdetails.id = id;
        userdetails.userName = userName;
        userdetails.address = address;
        return userdetails;



    }
}
