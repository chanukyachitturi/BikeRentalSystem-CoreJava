package com.model;

public class ElectricBike extends Bike {

    private int batteryPercentage;

    public ElectricBike(int vehicleId,
                        String brand,
                        String model,
                        String numberPlate,
                        double rentPerDay,
                        boolean available,
                        int batteryPercentage) {

        super(vehicleId,
              brand,
              model,
              numberPlate,
              rentPerDay,
              available);

        this.batteryPercentage = batteryPercentage;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    @Override
    public double calculateRent(int days) {

        return getRentPerDay() * days * 0.90;

    }
    @Override
    public String toString() {

        return super.toString()
                + "\nBattery : " + batteryPercentage + "%";

    }

}