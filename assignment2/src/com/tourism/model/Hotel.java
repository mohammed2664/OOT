package com.tourism.model;

/** Multilevel Level 1: Accommodation -> Hotel. */
public class Hotel extends Accommodation {
    private double roomServiceRate;

    public Hotel(String name, double ratePerNight, double roomServiceRate) {
        super(name, ratePerNight);
        this.roomServiceRate = roomServiceRate;
    }

    @Override
    public double calculateBill(int nights) {
        return super.calculateBill(nights) + (roomServiceRate * nights);
    }
}