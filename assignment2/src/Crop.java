/**
 * Represents a generic crop in the Agriculture domain.
 * This is the top-level base class in the Multilevel Inheritance chain.
 *
 * <p>Inheritance chain: {@code Crop → FoodGrain → OrganicFoodGrain}</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public class Crop {

    /** Name of the crop */
    private String cropName;

    /** Growing season (Kharif, Rabi, Zaid) */
    private String season;

    /** Expected yield per acre in quintals */
    private double yieldPerAcre;

    /**
     * Constructs a Crop with the specified details.
     *
     * @param cropName     the name of the crop
     * @param season       the growing season
     * @param yieldPerAcre the yield per acre in quintals
     */
    public Crop(String cropName, String season, double yieldPerAcre) {
        this.cropName = cropName;
        this.season = season;
        this.yieldPerAcre = yieldPerAcre;
    }

    /**
     * Displays the basic crop information.
     */
    public void displayInfo() {
        System.out.println("  Crop Name    : " + cropName);
        System.out.println("  Season       : " + season);
        System.out.println("  Yield/Acre   : " + yieldPerAcre + " quintals");
    }

    /**
     * Gets the crop name.
     * @return the crop name
     */
    public String getCropName() { return cropName; }

    /**
     * Gets the growing season.
     * @return the season
     */
    public String getSeason() { return season; }

    /**
     * Gets the yield per acre.
     * @return yield in quintals per acre
     */
    public double getYieldPerAcre() { return yieldPerAcre; }
}
