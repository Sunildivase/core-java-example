package com.overriding.service;

public class OverridingDemo {

    public static void main(String[] args) {

        VehicleService vehicleService = new VehicleService();
        vehicleService.move();

//        CarService carService = new CarService();
//        carService.move();


        vehicleService = new CarService();
        vehicleService.move();  // data hiding
    }
}
