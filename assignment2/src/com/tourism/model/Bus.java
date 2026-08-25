package com.tourism.model;

/** Hierarchical Branch 2: Transport -> Bus. */
public class Bus extends Transport {
    private double luggageFee;

    public Bus(String route, double fare, double luggageFee) {
        super(route, fare);
        this.luggageFee = luggageFee;
    }

    @Override
    public double calculateTotalFare() {
        return getFare() + luggageFee;
    }
}