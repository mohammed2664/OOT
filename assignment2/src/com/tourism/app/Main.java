package com.tourism.app;

import com.tourism.exception.InvalidBookingException;
import com.tourism.model.*;
import com.tourism.service.BookingManager;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Entry point for the upgraded Tourism Management System. */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingManager manager = new BookingManager();
        int choice = -1;

        do {
            try {
                System.out.println("\n=== ENTERPRISE TOURISM SYSTEM (MCA GRADE) ===");
                System.out.println("1. Single Inheritance (Book International Tour)");
                System.out.println("2. Multilevel Inheritance (Book Resort Stay)");
                System.out.println("3. Hierarchical Inheritance (Book Flight / Bus)");
                System.out.println("4. Multiple & Hybrid Inheritance (Book Premium Package)");
                System.out.println("5. View All Active Bookings (Runtime Polymorphism)");
                System.out.println("6. Exit");
                System.out.print("Select choice [1-6]: ");

                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice < 1 || choice > 6) {
                    throw new InvalidBookingException("Invalid option! Choose a number between 1 and 6.");
                }

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Destination: ");
                        String dest = scanner.nextLine();
                        System.out.print("Enter Base Price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter Visa Fee: ");
                        double visa = scanner.nextDouble();

                        if (price < 0 || visa < 0) throw new InvalidBookingException("Amounts cannot be negative.");

                        InternationalTour tour = new InternationalTour(dest, price, visa);
                        manager.addTour(tour);
                        System.out.println("Booking Confirmed!");
                        tour.displayDetails();
                    }
                    case 2 -> {
                        Resort resort = new Resort("Grand Paradise Resort", 250.0, 40.0, 50.0);
                        System.out.print("Enter Stay Duration (Nights): ");
                        int nights = scanner.nextInt();
                        if (nights <= 0) throw new InvalidBookingException("Nights must be greater than zero.");

                        double total = resort.calculateBill(nights);
                        System.out.println("Multilevel Calculation:");
                        System.out.println("Resort: " + resort.getName() + " | Bill (" + nights + " nights): $" + total);
                    }
                    case 3 -> {
                        Transport flight = new Flight("NYC -> LON", 500.0, 75.0);
                        Transport bus = new Bus("NYC -> PHI", 40.0, 10.0);

                        manager.addTransport(flight);
                        manager.addTransport(bus);

                        System.out.println("Hierarchical Transports Registered:");
                        System.out.println("Flight Total Fare: $" + flight.calculateTotalFare());
                        System.out.println("Bus Total Fare: $" + bus.calculateTotalFare());
                    }
                    case 4 -> {
                        PremiumPackage pkg = new PremiumPackage("Maldives Luxury", 1200.0, 150.0, 200.0, 300.0);
                        manager.addTour(pkg);
                        System.out.println("Hybrid Package Booked!");
                        pkg.displayDetails();
                    }
                    case 5 -> {
                        manager.displayAllTours();
                        manager.displayAllTransports();
                    }
                    case 6 -> System.out.println("Shutting down Tourism Application.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input Error: Expected a valid number.");
                scanner.nextLine();
            } catch (InvalidBookingException e) {
                System.out.println("Validation Error: " + e.getMessage());
            }
        } while (choice != 6);

        scanner.close();
    }
}