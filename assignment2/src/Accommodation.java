/**
 * Represents a generic tourism accommodation.
 * This is the parent class in the Hierarchical Inheritance demonstration.
 *
 * <p>Child classes: {@link Hotel}, {@link Resort}, {@link Homestay}</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public class Accommodation {

    /** Name of the accommodation */
    private String name;

    /** Location / city */
    private String location;

    /** Price per night in INR */
    private double pricePerNight;

    /** Guest rating out of 5 */
    private double rating;

    /**
     * Constructs an Accommodation with the specified details.
     *
     * @param name          the accommodation name
     * @param location      the location
     * @param pricePerNight the price per night in INR
     * @param rating        the guest rating (0-5)
     */
    public Accommodation(String name, String location, double pricePerNight, double rating) {
        this.name = name;
        this.location = location;
        this.pricePerNight = pricePerNight;
        this.rating = rating;
    }

    /**
     * Displays the accommodation details.
     */
    public void displayDetails() {
        System.out.println("  Name         : " + name);
        System.out.println("  Location     : " + location);
        System.out.println("  Price/Night  : Rs. " + String.format("%.2f", pricePerNight));
        System.out.println("  Rating       : " + rating + " / 5.0");
    }

    /**
     * Calculates the total cost for a stay.
     *
     * @param nights the number of nights
     * @return total cost in INR
     */
    public double calculateStayCost(int nights) {
        return pricePerNight * nights;
    }

    /**
     * Gets the accommodation name.
     * @return the name
     */
    public String getName() { return name; }

    /**
     * Gets the location.
     * @return the location
     */
    public String getLocation() { return location; }

    /**
     * Gets the price per night.
     * @return price per night in INR
     */
    public double getPricePerNight() { return pricePerNight; }

    /**
     * Gets the guest rating.
     * @return rating out of 5
     */
    public double getRating() { return rating; }
}
