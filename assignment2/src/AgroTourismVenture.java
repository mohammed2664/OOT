/**
 * Represents an agro-tourism venture extending {@link Business}.
 * Part of the hierarchical layer in the <b>Hybrid Inheritance</b> demonstration.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Business
 */
public class AgroTourismVenture extends Business {

    /** Type of farm (e.g., Plantation, Dairy, Organic) */
    private String farmType;

    /** Area of the farm in acres */
    private double farmAreaAcres;

    /** Number of visitors per month */
    private int monthlyVisitors;

    /**
     * Constructs an AgroTourismVenture with all details.
     *
     * @param businessName    the business name
     * @param ownerName       the owner's name
     * @param annualRevenue   the annual revenue in INR
     * @param farmType        the type of farm
     * @param farmAreaAcres   the farm area in acres
     * @param monthlyVisitors the average monthly visitors
     */
    public AgroTourismVenture(String businessName, String ownerName, double annualRevenue,
                              String farmType, double farmAreaAcres, int monthlyVisitors) {
        super(businessName, ownerName, annualRevenue);
        this.farmType = farmType;
        this.farmAreaAcres = farmAreaAcres;
        this.monthlyVisitors = monthlyVisitors;
    }

    /**
     * Displays agro-tourism venture details.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Farm Type    : " + farmType);
        System.out.println("  Farm Area    : " + farmAreaAcres + " acres");
        System.out.println("  Visitors/Mo  : " + monthlyVisitors);
    }

    /**
     * Gets the farm type.
     * @return the farm type
     */
    public String getFarmType() { return farmType; }

    /**
     * Gets the farm area in acres.
     * @return the farm area
     */
    public double getFarmAreaAcres() { return farmAreaAcres; }

    /**
     * Gets the monthly visitor count.
     * @return monthly visitors
     */
    public int getMonthlyVisitors() { return monthlyVisitors; }
}
