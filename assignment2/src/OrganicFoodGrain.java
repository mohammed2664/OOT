/**
 * Represents an organic food grain, the deepest class in the Multilevel Inheritance chain.
 * Demonstrates <b>Multilevel Inheritance</b> in the Agriculture domain.
 *
 * <p>Inheritance chain: {@code Crop → FoodGrain → OrganicFoodGrain}</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Crop
 * @see FoodGrain
 */
public class OrganicFoodGrain extends FoodGrain {

    /** Name of the organic certification body (e.g., FSSAI Organic, India Organic) */
    private String certificationBody;

    /** Whether the crop is 100% pesticide-free */
    private boolean pesticideFree;

    /** Premium percentage charged over conventional price */
    private double premiumPercent;

    /**
     * Constructs an OrganicFoodGrain with all details.
     *
     * @param cropName          the name of the crop
     * @param season            the growing season
     * @param yieldPerAcre      the yield per acre in quintals
     * @param grainType         the type of grain
     * @param proteinContent    the protein content percentage
     * @param mspPerQuintal     the MSP in INR per quintal
     * @param certificationBody the certification authority
     * @param pesticideFree     whether it is pesticide-free
     * @param premiumPercent    the organic premium percentage
     */
    public OrganicFoodGrain(String cropName, String season, double yieldPerAcre,
                            String grainType, double proteinContent, double mspPerQuintal,
                            String certificationBody, boolean pesticideFree, double premiumPercent) {
        super(cropName, season, yieldPerAcre, grainType, proteinContent, mspPerQuintal);
        this.certificationBody = certificationBody;
        this.pesticideFree = pesticideFree;
        this.premiumPercent = premiumPercent;
    }

    /**
     * Displays full organic food grain details across all three inheritance levels.
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("  Certification: " + certificationBody);
        System.out.println("  Pesticide-Free: " + (pesticideFree ? "Yes" : "No"));
        System.out.println("  Organic Premium: " + premiumPercent + "%");
    }

    /**
     * Calculates revenue with the organic premium applied.
     *
     * @return estimated revenue with organic premium in INR
     */
    @Override
    public double estimateRevenue() {
        return super.estimateRevenue() * (1 + premiumPercent / 100);
    }

    /**
     * Gets the certification body.
     * @return the certification body name
     */
    public String getCertificationBody() { return certificationBody; }

    /**
     * Checks if the crop is pesticide-free.
     * @return true if pesticide-free
     */
    public boolean isPesticideFree() { return pesticideFree; }

    /**
     * Gets the organic premium percentage.
     * @return the premium percentage
     */
    public double getPremiumPercent() { return premiumPercent; }
}
