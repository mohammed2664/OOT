/**
 * Represents a tour operator business extending {@link Business}.
 * Part of the hierarchical layer in the <b>Hybrid Inheritance</b> demonstration.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Business
 */
public class TourOperator extends Business {

    /** Number of tour packages offered */
    private int numberOfPackages;

    /** Primary region of operation */
    private String operatingRegion;

    /**
     * Constructs a TourOperator with all details.
     *
     * @param businessName    the business name
     * @param ownerName       the owner's name
     * @param annualRevenue   the annual revenue in INR
     * @param numberOfPackages the number of tour packages offered
     * @param operatingRegion  the primary operating region
     */
    public TourOperator(String businessName, String ownerName, double annualRevenue,
                        int numberOfPackages, String operatingRegion) {
        super(businessName, ownerName, annualRevenue);
        this.numberOfPackages = numberOfPackages;
        this.operatingRegion = operatingRegion;
    }

    /**
     * Displays tour operator details.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Packages     : " + numberOfPackages);
        System.out.println("  Region       : " + operatingRegion);
    }

    /**
     * Gets the number of packages.
     * @return number of tour packages
     */
    public int getNumberOfPackages() { return numberOfPackages; }

    /**
     * Gets the operating region.
     * @return the operating region
     */
    public String getOperatingRegion() { return operatingRegion; }
}
