package com.tourism.model;

/** Hierarchical Branch 1: Transport -> Flight. */
public class Flight extends Transport {
    private double airportTax;

    public Flight(String route, double fare, double airportTax) {
        super(route, fare);
        this.airportTax = airportTax;
    }

    @Override
    public double calculateTotalFare() {
        return getFare() + airportTax;
    }
}