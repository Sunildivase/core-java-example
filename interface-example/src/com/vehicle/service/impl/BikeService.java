package com.vehicle.service.impl;

import com.vehicle.service.VehicleService;

public class BikeService implements VehicleService {
    @Override
    public void start() {
        System.out.println("bike is starting...");
    }
}
