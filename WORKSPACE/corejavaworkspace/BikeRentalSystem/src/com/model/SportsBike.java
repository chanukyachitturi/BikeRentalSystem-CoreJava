package com.model;

public class SportsBike extends Bike {

    private boolean helmetIncluded;

    public SportsBike(int vehicleId,
                      String brand,
                      String model,
                      String numberPlate,
                      double rentPerDay,
                      boolean available,
                      boolean helmetIncluded) {

        super(vehicleId, brand, model, numberPlate, rentPerDay, available);

        this.helmetIncluded = helmetIncluded;
    }

    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }

    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public double calculateRent(int days) {
        return getRentPerDay() * days * 1.20;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nHelmet Included : " + helmetIncluded;
    }
}