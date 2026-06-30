package com.model;

import com.interfaces.Rentable;

public class Bike extends Vehicle implements Rentable {

    private String numberPlate;
    private double rentPerDay;
    private boolean available;

    public Bike(int vehicleId, String brand, String model,
                String numberPlate, double rentPerDay, boolean available) {

        super(vehicleId, brand, model);

        this.numberPlate = numberPlate;
        this.rentPerDay = rentPerDay;
        this.available = available;
    }
    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void setRentPerDay(double rentPerDay) {
        this.rentPerDay = rentPerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Generate Getters & Setters

    @Override
    public double calculateRent(int days) {

        return rentPerDay * days;

    }
    @Override
    public void rent() {

        available = false;

    }

    @Override
    public void returnBike() {

        available = true;

    }
    @Override
    public String toString() {

        return super.toString()
                + "\nNumber Plate : " + numberPlate
                + "\nRent/Day     : ₹" + rentPerDay
                + "\nAvailable    : " + available;

    }
}