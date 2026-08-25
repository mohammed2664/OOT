/**
 * Represents a generic tour package in the Tourism domain.
 * This class serves as the base class in the Single Inheritance demonstration.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public class TourPackage {

    /** Name of the tour package */
    private String packageName;

    /** Destination of the tour */
    private String destination;

    /** Duration of the tour in days */
    private int durationInDays;

    /** Base price of the package in INR */
    private double basePrice;

    /**
     * Constructs a TourPackage with the specified details.
     *
     * @param packageName    the name of the tour package
     * @param destination    the tour destination
     * @param durationInDays the duration in days
     * @param basePrice      the base price in INR
     */
    public TourPackage(String packageName, String destination, int durationInDays, double basePrice) {
        this.packageName = packageName;
        this.destination = destination;
        this.durationInDays = durationInDays;
        this.basePrice = basePrice;
    }

    /**
     * Displays the details of this tour package.
     */
    public void displayDetails() {
        System.out.println("  Package Name : " + packageName);
        System.out.println("  Destination  : " + destination);
        System.out.println("  Duration     : " + durationInDays + " days");
        System.out.println("  Base Price   : Rs. " + String.format("%.2f", basePrice));
    }

    /**
     * Calculates the total cost of the tour package.
     *
     * @return the total cost equal to the base price
     */
    public double calculateCost() {
        return basePrice;
    }

    /**
     * Gets the package name.
     * @return the package name
     */
    public String getPackageName() { return packageName; }

    /**
     * Sets the package name.
     * @param packageName the new package name
     */
    public void setPackageName(String packageName) { this.packageName = packageName; }

    /**
     * Gets the destination.
     * @return the destination
     */
    public String getDestination() { return destination; }

    /**
     * Sets the destination.
     * @param destination the new destination
     */
    public void setDestination(String destination) { this.destination = destination; }

    /**
     * Gets the duration in days.
     * @return the duration in days
     */
    public int getDurationInDays() { return durationInDays; }

    /**
     * Sets the duration in days.
     * @param durationInDays the new duration
     */
    public void setDurationInDays(int durationInDays) { this.durationInDays = durationInDays; }

    /**
     * Gets the base price.
     * @return the base price in INR
     */
    public double getBasePrice() { return basePrice; }

    /**
     * Sets the base price.
     * @param basePrice the new base price
     */
    public void setBasePrice(double basePrice) { this.basePrice = basePrice; }
}
