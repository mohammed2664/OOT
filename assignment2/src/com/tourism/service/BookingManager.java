package com.tourism.service;

import com.tourism.model.Tour;
import com.tourism.model.Transport;
import java.util.ArrayList;
import java.util.List;

/** In-memory registry demonstrating Collections and Runtime Polymorphism. */
public class BookingManager {
    private final List<Tour> tourBookings = new ArrayList<>();
    private final List<Transport> transportBookings = new ArrayList<>();

    public void addTour(Tour tour) {
        tourBookings.add(tour);
    }

    public void addTransport(Transport transport) {
        transportBookings.add(transport);
    }

    public void displayAllTours() {
        if (tourBookings.isEmpty()) {
            System.out.println("No active tour bookings found.");
            return;
        }
        System.out.println("\n--- Active Tour Bookings (Polymorphic Dispatch) ---");
        for (Tour t : tourBookings) {
            t.displayDetails();
            System.out.println("--------------------------------");
        }
    }

    public void displayAllTransports() {
        if (transportBookings.isEmpty()) {
            System.out.println("No active transport bookings found.");
            return;
        }
        System.out.println("\n--- Active Transport Bookings (Polymorphic Dispatch) ---");
        for (Transport tr : transportBookings) {
            System.out.println("Route: " + tr.getRoute() + " | Final Fare: $" + tr.calculateTotalFare());
        }
    }
}