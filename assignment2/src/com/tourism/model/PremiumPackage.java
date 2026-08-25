package com.tourism.model;

/** Hybrid Inheritance: Extends InternationalTour, implements GuideService and CateringService. */
public class PremiumPackage extends InternationalTour implements GuideService, CateringService {
    private double guideFee;
    private double cateringFee;

    public PremiumPackage(String destination, double basePrice, double visaFee, double guideFee, double cateringFee) {
        super(destination, basePrice, visaFee);
        this.guideFee = guideFee;
        this.cateringFee = cateringFee;
    }

    @Override
    public double getGuideFee() { return guideFee; }

    @Override
    public void assignGuide() {
        System.out.println("Guide Service: Dedicated bilingual guide ($" + guideFee + ")");
    }

    @Override
    public double getCateringFee() { return cateringFee; }

    @Override
    public void provideMeals() {
        System.out.println("Catering Service: All-inclusive gourmet dining ($" + cateringFee + ")");
    }

    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost() + guideFee + cateringFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        assignGuide();
        provideMeals();
    }
}