/**
 * Represents a sustainable agro-tourism business.
 * Demonstrates <b>Hybrid Inheritance</b> by combining:
 * <ul>
 *   <li>Hierarchical inheritance: extends {@link AgroTourismVenture} (which extends {@link Business})</li>
 *   <li>Multiple inheritance: implements the {@link EcoFriendly} interface</li>
 * </ul>
 *
 * <p>This class merges the Tourism and Agriculture domains into a single
 * sustainable business model.</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Business
 * @see AgroTourismVenture
 * @see EcoFriendly
 */
public class SustainableAgroTourism extends AgroTourismVenture implements EcoFriendly {

    /** Carbon footprint in tonnes of CO2 per year */
    private double carbonFootprint;

    /** Whether the business uses renewable energy */
    private boolean usesRenewableEnergy;

    /** Whether organic farming practices are followed */
    private boolean organicFarming;

    /**
     * Constructs a SustainableAgroTourism business with all details.
     *
     * @param businessName        the business name
     * @param ownerName           the owner's name
     * @param annualRevenue       the annual revenue in INR
     * @param farmType            the type of farm
     * @param farmAreaAcres       the farm area in acres
     * @param monthlyVisitors     the average monthly visitors
     * @param carbonFootprint     the CO2 footprint in tonnes/year
     * @param usesRenewableEnergy whether renewable energy is used
     * @param organicFarming      whether organic farming is practiced
     */
    public SustainableAgroTourism(String businessName, String ownerName, double annualRevenue,
                                  String farmType, double farmAreaAcres, int monthlyVisitors,
                                  double carbonFootprint, boolean usesRenewableEnergy,
                                  boolean organicFarming) {
        super(businessName, ownerName, annualRevenue, farmType, farmAreaAcres, monthlyVisitors);
        this.carbonFootprint = carbonFootprint;
        this.usesRenewableEnergy = usesRenewableEnergy;
        this.organicFarming = organicFarming;
    }

    /**
     * Displays full details combining business, agro-tourism, and eco-friendly info.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Renewable    : " + (usesRenewableEnergy ? "Yes" : "No"));
        System.out.println("  Organic      : " + (organicFarming ? "Yes" : "No"));
        System.out.println("  CO2 Footprint: " + carbonFootprint + " tonnes/year");
        System.out.println("  Eco Rating   : " + getSustainabilityRating());
    }

    /**
     * Gets the carbon footprint.
     * Implementation of {@link EcoFriendly#getCarbonFootprint()}.
     *
     * @return carbon footprint in tonnes CO2/year
     */
    @Override
    public double getCarbonFootprint() {
        return carbonFootprint;
    }

    /**
     * Determines the sustainability rating based on eco-friendly practices.
     * Implementation of {@link EcoFriendly#getSustainabilityRating()}.
     *
     * <ul>
     *   <li><b>Gold</b> — uses renewable energy AND practices organic farming</li>
     *   <li><b>Silver</b> — uses either renewable energy OR organic farming</li>
     *   <li><b>Bronze</b> — uses neither</li>
     * </ul>
     *
     * @return the sustainability rating (Gold, Silver, or Bronze)
     */
    @Override
    public String getSustainabilityRating() {
        if (usesRenewableEnergy && organicFarming) return "Gold";
        else if (usesRenewableEnergy || organicFarming) return "Silver";
        else return "Bronze";
    }

    /**
     * Displays the eco-friendly practices followed.
     * Implementation of {@link EcoFriendly#displayEcoPractices()}.
     */
    @Override
    public void displayEcoPractices() {
        System.out.println("  Eco-Friendly Practices:");
        if (usesRenewableEnergy)
            System.out.println("    - Solar/Wind powered operations");
        if (organicFarming)
            System.out.println("    - 100% Organic farming (no chemical fertilizers)");
        System.out.println("    - Water conservation through drip irrigation");
        System.out.println("    - Waste composting and recycling");
        if (carbonFootprint < 5)
            System.out.println("    - Near carbon-neutral operations");
    }
}
