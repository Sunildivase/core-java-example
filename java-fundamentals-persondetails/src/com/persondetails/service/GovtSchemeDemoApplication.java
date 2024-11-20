package com.persondetails.service;

import com.persondetails.model.AddressDetails;
import com.persondetails.model.IncomeDetails;
import com.persondetails.model.PersonDetails;
import com.persondetails.model.SchemeDetails;

import java.util.Scanner;

public class GovtSchemeDemoApplication {

    public static void main(String[] args) {

        // new operators - provides new object
        // here we create scanner for person details
        // we can print the values in person details and save the data

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("please enter age: ");
        int age = scanner.nextInt();

        PersonDetails persondetails = new PersonDetails();
        persondetails.firstName = firstName;
        persondetails.lastName = lastName;
        persondetails.age =age;

        System.out.println("person details received in system: " + persondetails);

        // here we create scanner1 for address details
        //we can save data of address details

        Scanner scanner1= new Scanner(System.in);

        System.out.println("please enter house no or building name: ");
        String houseNoBuildingName = scanner1.nextLine();

        System.out.println("please enter landmark: ");
        String landmark = scanner1.nextLine();

        System.out.println(" please enter city: ");
        String city =scanner1.nextLine();

        System.out.println("please enter tehsil: ");
        String tehsil = scanner1.nextLine();

        System.out.println("please enter district: ");
        String district = scanner1.nextLine();

        System.out.println("please enter state: ");
        String state = scanner1.nextLine();

        System.out.println("please enter pin: ");
        int pin = scanner1.nextInt();

        AddressDetails addressdetails = new AddressDetails();
        addressdetails.houseNoBuildingName = houseNoBuildingName;
        addressdetails.landmark = landmark;
        addressdetails.city=city;
        addressdetails.tehsil=tehsil;
        addressdetails.district=district;
        addressdetails.state=state;
        addressdetails.pin=pin;

        System.out.println(" Address details received in system: "+ addressdetails);

        // here we create new scanner2 for income details
        // here we save the data of income details

        Scanner scanner2 = new Scanner(System.in);

        System.out.println(" please enter annual income: ");
        int annualIncome=scanner2.nextInt();

        IncomeDetails incomedetails = new IncomeDetails();
        incomedetails.annualIncome = annualIncome;

        System.out.println("Income details received in system: " + incomedetails);

        // here we create scanner3 for scheme details
        // here we save the data of scheme details

        Scanner scanner3 = new Scanner(System.in);

        System.out.println("please enter scheme name: ");
        String scheme = scanner3.nextLine();

        SchemeDetails schemedetails = new SchemeDetails();
        schemedetails.scheme = scheme;

        System.out.println("scheme details are received in system: "+ schemedetails);
    }
}

