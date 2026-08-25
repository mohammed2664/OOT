/**
 * Represents a food grain crop, extending {@link Crop}.
 * This is the intermediate class in the Multilevel Inheritance chain.
 *
 * <p>Inheritance chain: {@code Crop → FoodGrain → OrganicFoodGrain}</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Crop
 */
public class FoodGrain extends Crop {

    /** Type of grain (e.g., Cereal, Pulse, Millet) */
    private String grainType;

    /** Protein content as a percentage */
    private double proteinContent;

    /** Minimum Support Price set by the government in INR per quintal */
    private double mspPerQuintal;

    /**
     * Constructs a FoodGrain with all details.
     *
     * @param cropName       the name of the crop
     * @param season         the growing season
     * @param yieldPerAcre   the yield per acre in quintals
     * @param grainType      the type of grain
     * @param proteinContent the protein content percentage
     * @param mspPerQuintal  the MSP in INR per quintal
     */
    public FoodGrain(String cropName, String season, double yieldPerAcre,
                     String grainType, double proteinContent, double mspPerQuintal) {
        super(cropName, season, yieldPerAcre);
        this.grainType = grainType;
        this.proteinContent = proteinContent;
        this.mspPerQuintal = mspPerQuintal;
    }

    /**
     * Displays food grain details including base crop information.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Grain Type   : " + grainType);
        System.out.println("  Protein      : " + proteinContent + "%");
        System.out.println("  MSP          : Rs. " + String.format("%.2f", mspPerQuintal) + "/quintal");
    }

    /**
     * Calculates estimated revenue per acre based on yield and MSP.
     *
     * @return the estimated revenue in INR
     */
    public double estimateRevenue() {
        return getYieldPerAcre() * mspPerQuintal;
    }

    /**
     * Gets the grain type.
     * @return the grain type
     */
    public String getGrainType() { return grainType; }

    /**
     * Gets the protein content.
     * @return protein content percentage
     */
    public double getProteinContent() { return proteinContent; }

    /**
     * Gets the MSP per quintal.
     * @return MSP in INR
     */
    public double getMspPerQuintal() { return mspPerQuintal; }
}
