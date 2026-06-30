package com.model;

public abstract class Vehicle {

	private int vehicleId;
    private String brand;
    private String model;
	public Vehicle(int vehicleId, String brand, String model) {
		super();
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.model = model;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public abstract double calculateRent(int days);
	
	@Override
	public String toString() {
	    return "Vehicle ID : " + getVehicleId()
	            + "\nBrand      : " + getBrand()
	            + "\nModel      : " + getModel();
	}

}
