package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Bike;
import com.model.Customer;
import com.model.Rental;

public class RentalService {

	private List<Rental> rentals = new ArrayList<>();

	public void addRental(Rental rental) {

		rentals.add(rental);

	}

	public void displayRentals() {

		for (Rental rental : rentals) {

			System.out.println(rental);

		}

	}

	public void rentBike(Bike bike, Customer customer, int days) {

		bike.rent();

		double amount = bike.calculateRent(days);

		Rental rental = new Rental(rentals.size() + 1, bike, customer, days, amount);

		rentals.add(rental);

		System.out.println("Bike Rented Successfully");

		System.out.println(rental);

	}
	
	public void returnBike(Bike bike){

	    bike.returnBike();

	    System.out.println("Bike Returned Successfully");

	}

}