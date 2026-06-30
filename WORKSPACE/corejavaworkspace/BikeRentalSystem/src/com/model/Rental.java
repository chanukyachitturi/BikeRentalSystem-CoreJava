package com.model;

public class Rental {

    private int rentalId;
    private Bike bike;
    private Customer customer;
    private int days;
    private double totalAmount;

    public Rental(int rentalId, Bike bike, Customer customer, int days, double totalAmount) {
        this.rentalId = rentalId;
        this.bike = bike;
        this.customer = customer;
        this.days = days;
        this.totalAmount = totalAmount;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    
    @Override
    public String toString() {

        return "Rental ID : " + rentalId
                + "\nCustomer : " + customer.getName()
                + "\nBike : " + bike.getBrand() + " " + bike.getModel()
                + "\nDays : " + days
                + "\nAmount : ₹" + totalAmount;

    }

}