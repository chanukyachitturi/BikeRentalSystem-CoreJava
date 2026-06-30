package com.service;

import java.util.HashMap;
import java.util.Map;

import com.model.Customer;

public class CustomerService {

    private Map<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {

        customers.put(customer.getCustomerId(), customer);

    }

    public Customer searchCustomer(int customerId) {

        return customers.get(customerId);

    }

    public void displayCustomers() {

        for (Customer customer : customers.values()) {

            System.out.println(customer);

        }

    }

}