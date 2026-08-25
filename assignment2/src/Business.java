/**
 * Represents a generic business entity.
 * This is the root class in the <b>Hybrid Inheritance</b> demonstration.
 *
 * <p>The hybrid pattern combines hierarchical inheritance
 * ({@code Business → AgroTourismVenture}, {@code Business → TourOperator})
 * with multiple inheritance via the {@link EcoFriendly} interface.</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public class Business {

    /** Name of the business */
    private String businessName;

    /** Owner's name */
    private String ownerName;

    /** Annual revenue in INR */
    private double annualRevenue;

    /**
     * Constructs a Business with the specified details.
     *
     * @param businessName  the business name
     * @param ownerName     the owner's name
     * @param annualRevenue the annual revenue in INR
     */
    public Business(String businessName, String ownerName, double annualRevenue) {
        this.businessName = businessName;
        this.ownerName = ownerName;
        this.annualRevenue = annualRevenue;
    }

    /**
     * Displays the business details.
     */
    public void displayDetails() {
        System.out.println("  Business     : " + businessName);
        System.out.println("  Owner        : " + ownerName);
        System.out.println("  Revenue      : Rs. " + String.format("%.2f", annualRevenue));
    }

    /**
     * Gets the business name.
     * @return the business name
     */
    public String getBusinessName() { return businessName; }

    /**
     * Gets the owner name.
     * @return the owner name
     */
    public String getOwnerName() { return ownerName; }

    /**
     * Gets the annual revenue.
     * @return the annual revenue in INR
     */
    public double getAnnualRevenue() { return annualRevenue; }
}
