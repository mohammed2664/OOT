/**
 * Represents agricultural farm land that is both irrigable and insurable.
 * Demonstrates <b>Multiple Inheritance</b> by implementing two interfaces:
 * {@link Irrigable} and {@link Insurable}.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Irrigable
 * @see Insurable
 */
public class FarmLand implements Irrigable, Insurable {

    /** Location of the farm land */
    private String location;

    /** Total area of the farm in acres */
    private double areaInAcres;

    /** Type of soil (e.g., Alluvial, Black, Red, Laterite) */
    private String soilType;

    /** Name of the crop currently being cultivated */
    private String currentCrop;

    /** Land value in INR per acre */
    private double landValuePerAcre;

    /**
     * Constructs a FarmLand with the specified details.
     *
     * @param location         the farm location
     * @param areaInAcres      the area in acres
     * @param soilType         the soil type
     * @param currentCrop      the crop being cultivated
     * @param landValuePerAcre the land value per acre in INR
     */
    public FarmLand(String location, double areaInAcres, String soilType,
                    String currentCrop, double landValuePerAcre) {
        this.location = location;
        this.areaInAcres = areaInAcres;
        this.soilType = soilType;
        this.currentCrop = currentCrop;
        this.landValuePerAcre = landValuePerAcre;
    }

    /**
     * Displays the farm land details.
     */
    public void displayDetails() {
        System.out.println("  Location     : " + location);
        System.out.println("  Area         : " + areaInAcres + " acres");
        System.out.println("  Soil Type    : " + soilType);
        System.out.println("  Current Crop : " + currentCrop);
        System.out.println("  Land Value   : Rs. " + String.format("%.2f", landValuePerAcre) + "/acre");
    }

    /**
     * Applies irrigation using the specified method.
     * Implementation of {@link Irrigable#irrigate(String)}.
     *
     * @param method the irrigation method
     */
    @Override
    public void irrigate(String method) {
        System.out.println("  Irrigating " + areaInAcres + " acres of " + currentCrop
                + " using " + method + " irrigation.");
    }

    /**
     * Gets the water requirement based on crop type and area.
     * Implementation of {@link Irrigable#getWaterRequirement()}.
     *
     * @return total water requirement in litres
     */
    @Override
    public double getWaterRequirement() {
        // Approximate: 5000 litres per acre per day
        return areaInAcres * 5000;
    }

    /**
     * Calculates the crop insurance premium at 2% of total land value.
     * Implementation of {@link Insurable#calculatePremium()}.
     *
     * @return the premium amount in INR
     */
    @Override
    public double calculatePremium() {
        return (landValuePerAcre * areaInAcres) * 0.02;
    }

    /**
     * Gets the crop insurance policy details.
     * Implementation of {@link Insurable#getPolicyDetails()}.
     *
     * @return the policy details string
     */
    @Override
    public String getPolicyDetails() {
        return "Pradhan Mantri Fasal Bima Yojana (PMFBY) - Crop: " + currentCrop
                + ", Area: " + areaInAcres + " acres, Location: " + location;
    }

    /**
     * Gets the location.
     * @return the location
     */
    public String getLocation() { return location; }

    /**
     * Gets the area in acres.
     * @return area in acres
     */
    public double getAreaInAcres() { return areaInAcres; }

    /**
     * Gets the soil type.
     * @return the soil type
     */
    public String getSoilType() { return soilType; }
}
