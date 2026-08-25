package com.tourism.model;

/** Multilevel Level 2: Hotel -> Resort. */
public class Resort extends Hotel {
    private double resortTax;

    public Resort(String name, double ratePerNight, double roomServiceRate, double resortTax) {
        super(name, ratePerNight, roomServiceRate);
        this.resortTax = resortTax;
    }

    @Override
    public double calculateBill(int nights) {
        return super.calculateBill(nights) + resortTax;
    }
}