package com.tourism.model;

/** Single inheritance: Tour -> InternationalTour. */
public class InternationalTour extends Tour {
    private double visaFee;

    public InternationalTour(String destination, double basePrice, double visaFee) {
        super(destination, basePrice);
        this.visaFee = visaFee;
    }

    public double getVisaFee() { return visaFee; }

    @Override
    public double calculateTotalCost() {
        return getBasePrice() + visaFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Visa Fee: $" + visaFee + " | Total Cost: $" + calculateTotalCost());
    }
}