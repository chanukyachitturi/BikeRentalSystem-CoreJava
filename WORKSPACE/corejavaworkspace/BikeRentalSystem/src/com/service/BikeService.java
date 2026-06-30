package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Bike;

public class BikeService {

    private List<Bike> bikes = new ArrayList<>();

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public void displayAllBikes() {
        for (Bike bike : bikes) {
            System.out.println(bike);
        }
    }

    public Bike searchBike(int vehicleId) {

        for (Bike bike : bikes) {

            if (bike.getVehicleId() == vehicleId) {
                return bike;
            }

        }

        return null;
    }

    public void removeBike(int vehicleId) {

        Bike bike = searchBike(vehicleId);

        if (bike != null) {
            bikes.remove(bike);
            System.out.println("Bike Removed Successfully");
        } else {
            System.out.println("Bike Not Found");
        }

    }

    public List<Bike> getBikes() {
        return bikes;
    }

}