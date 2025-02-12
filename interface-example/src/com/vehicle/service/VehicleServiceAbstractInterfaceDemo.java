package com.vehicle.service;

import com.vehicle.service.impl.BikeService;
import com.vehicle.service.impl.CarService;

public class VehicleServiceAbstractInterfaceDemo {

    public static void main(String[] args) {

        VehicleService carService = new CarService();
        carService.start();

        VehicleService bikeService =new BikeService();
        bikeService.start();


       // for data hiding concept

        //data hiding
        VehicleService vehicleService = new CarService();
        vehicleService.start();

        //data hiding
        vehicleService = new BikeService();
        vehicleService.start();
    }
}
