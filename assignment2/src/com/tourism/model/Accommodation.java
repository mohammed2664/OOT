package com.tourism.model;

/** Multilevel inheritance base. */
public class Accommodation {
    private String name;
    private double ratePerNight;

    public Accommodation(String name, double ratePerNight) {
        this.name = name;
        this.ratePerNight = ratePerNight;
    }

    public String getName() { return name; }
    public double getRatePerNight() { return ratePerNight; }

    public double calculateBill(int nights) {
        return ratePerNight * nights;
    }
}