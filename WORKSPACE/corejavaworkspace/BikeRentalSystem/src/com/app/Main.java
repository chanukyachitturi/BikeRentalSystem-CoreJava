package com.app;

import java.util.Scanner;

import com.service.BikeService;
import com.service.CustomerService;
import com.service.RentalService;
import com.model.Bike;
import com.model.Customer;
import com.model.ElectricBike;
import com.model.SportsBike;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BikeService bikeService = new BikeService();
        CustomerService customerService = new CustomerService();
        RentalService rentalService = new RentalService();
        
        bikeService.addBike(new SportsBike(
                1,
                "Yamaha",
                "R15",
                "AP39AB1234",
                800,
                true,
                true));

        bikeService.addBike(new SportsBike(
                2,
                "KTM",
                "Duke 390",
                "AP39XY4567",
                1000,
                true,
                true));

        bikeService.addBike(new ElectricBike(
                3,
                "Ola",
                "S1 Pro",
                "AP39ZZ9999",
                600,
                true,
                90));

        bikeService.addBike(new ElectricBike(
                4,
                "Ather",
                "450X",
                "AP39TT5555",
                650,
                true,
                80));

        customerService.addCustomer(new Customer(
                101,
                "Sai",
                "9876543210",
                "DL001"));

        customerService.addCustomer(new Customer(
                102,
                "Rahul",
                "9999999999",
                "DL002"));
        customerService.addCustomer(new Customer(
                103,
                "Kiran",
                "8888888888",
                "DL003"));
        
        int choice;

        do {

            System.out.println("\n========== BIKE RENTAL SYSTEM ==========");

            System.out.println("1. Admin");

            System.out.println("2. Customer");

            System.out.println("3. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                int adminChoice;

                do {

                    System.out.println("\n========= ADMIN MENU =========");

                    System.out.println("1. Add Bike");

                    System.out.println("2. Remove Bike");

                    System.out.println("3. View All Bikes");

                    System.out.println("4. Search Bike");

                    System.out.println("5. Logout");

                    System.out.print("Enter Choice : ");

                    adminChoice = sc.nextInt();

                    switch (adminChoice) {

                    case 1:

                        System.out.println("\n1. Sports Bike");
                        System.out.println("2. Electric Bike");

                        int type = sc.nextInt();

                        System.out.print("Vehicle ID : ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Brand : ");
                        String brand = sc.nextLine();

                        System.out.print("Model : ");
                        String model = sc.nextLine();

                        System.out.print("Number Plate : ");
                        String plate = sc.nextLine();

                        System.out.print("Rent Per Day : ");
                        double rent = sc.nextDouble();

                        boolean available = true;

                        if(type==1){

                            System.out.print("Helmet Included(true/false): ");
                            boolean helmet = sc.nextBoolean();

                            bikeService.addBike(
                                    new SportsBike(id,brand,model,plate,rent,available,helmet));

                        }

                        else{

                            System.out.print("Battery Percentage : ");
                            int battery=sc.nextInt();

                            bikeService.addBike(
                                    new ElectricBike(id,brand,model,plate,rent,available,battery));

                        }

                        System.out.println("Bike Added Successfully");

                        break;

                    case 2:

                        System.out.print("Enter Bike ID : ");

                        int removeId=sc.nextInt();

                        bikeService.removeBike(removeId);

                        break;

                    case 3:

                        bikeService.displayAllBikes();

                        break;

                    case 4:

                        System.out.print("Enter Bike ID : ");

                        int bikeId = sc.nextInt();

                        System.out.println(bikeService.searchBike(bikeId));

                        break;

                    case 5:

                        System.out.println("Logging Out...");

                        break;

                    default:

                        System.out.println("Invalid Choice");

                    }

                } while (adminChoice != 5);

                break;

            case 2:

                int customerChoice;

                do {

                    System.out.println("\n========= CUSTOMER MENU =========");

                    System.out.println("1. View Bikes");

                    System.out.println("2. Rent Bike");

                    System.out.println("3. Return Bike");

                    System.out.println("4. View My Rentals");

                    System.out.println("5. Logout");

                    System.out.print("Enter Choice : ");

                    customerChoice = sc.nextInt();

                    switch (customerChoice) {

                    case 1:

                        bikeService.displayAllBikes();

                        break;

                    case 2:

                        System.out.print("Enter Customer ID : ");

                        int customerId=sc.nextInt();

                        Customer customer=
                                customerService.searchCustomer(customerId);

                        if(customer==null){

                            System.out.println("Customer Not Found");

                            break;

                        }

                        System.out.print("Enter Bike ID : ");

                        int bikeId=sc.nextInt();

                        Bike bike=
                                bikeService.searchBike(bikeId);

                        if(bike==null){

                            System.out.println("Bike Not Found");

                            break;

                        }

                        if(!bike.isAvailable()){

                            System.out.println("Bike Already Rented");

                            break;

                        }

                        System.out.print("Enter Number Of Days : ");

                        int days=sc.nextInt();

                        rentalService.rentBike(
                                bike,
                                customer,
                                days);

                        break;

                    case 3:

                        System.out.print("Enter Bike ID : ");

                        int returnId=sc.nextInt();

                        Bike returnBike=
                                bikeService.searchBike(returnId);

                        if(returnBike==null){

                            System.out.println("Bike Not Found");

                        }

                        else{

                            rentalService.returnBike(returnBike);

                        }

                        break;

                    case 4:

                        rentalService.displayRentals();

                        break;

                    case 5:

                        System.out.println("Logging Out...");

                        break;

                    default:

                        System.out.println("Invalid Choice");

                    }

                } while (customerChoice != 5);

                break;

            case 3:

                System.out.println("Thank You");

                break;

            default:

                System.out.println("Invalid Choice");

            }

        } while (choice != 3);

        sc.close();

    }

}