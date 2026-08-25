package com.tourism.model;

/** Abstract base class for Hierarchical inheritance. */
public abstract class Transport {
    private String route;
    private double fare;

    public Transport(String route, double fare) {
        this.route = route;
        this.fare = fare;
    }

    public String getRoute() { return route; }
    public double getFare() { return fare; }

    /** Abstract method for dynamic fare calculation. */
    public abstract double calculateTotalFare();
}