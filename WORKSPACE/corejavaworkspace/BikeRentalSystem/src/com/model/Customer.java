package com.model;

public class Customer {

    private int customerId;
    private String name;
    private String phone;
    private String licenseNumber;

    public Customer(int customerId, String name, String phone, String licenseNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {

        return "Customer ID : " + customerId
                + "\nName        : " + name
                + "\nPhone       : " + phone
                + "\nLicense No  : " + licenseNumber;

    }

}