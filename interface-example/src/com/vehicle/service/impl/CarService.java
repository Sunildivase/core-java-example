package com.vehicle.service.impl;

import com.vehicle.service.VehicleService;

public class CarService implements VehicleService {
    @Override
    public void start() {
        System.out.println("car is starting...");
    }
}
