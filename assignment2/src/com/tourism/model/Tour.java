package com.tourism.model;

/** Abstract base class for tours demonstrating Abstraction and Encapsulation. */
public abstract class Tour {
    private String destination;
    private double basePrice;

    public Tour(String destination, double basePrice) {
        this.destination = destination;
        this.basePrice = basePrice;
    }

    public String getDestination() { return destination; }
    public double getBasePrice() { return basePrice; }

    /** Abstract method for dynamic pricing. */
    public abstract double calculateTotalCost();

    public void displayDetails() {
        System.out.println("Destination: " + destination + " | Base Price: $" + basePrice);
    }
}