/**
 * Represents a resort accommodation extending {@link Accommodation}.
 * One of the child classes in the <b>Hierarchical Inheritance</b> demonstration.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Accommodation
 */
public class Resort extends Accommodation {

    /** Type of resort (e.g., Beach, Hill Station, Wellness) */
    private String resortType;

    /** Whether the resort offers an all-inclusive package */
    private boolean allInclusive;

    /** Whether the resort has a spa */
    private boolean hasSpa;

    /**
     * Constructs a Resort with all details.
     *
     * @param name          the resort name
     * @param location      the location
     * @param pricePerNight the price per night in INR
     * @param rating        the guest rating
     * @param resortType    the type of resort
     * @param allInclusive  whether it is all-inclusive
     * @param hasSpa        whether it has a spa
     */
    public Resort(String name, String location, double pricePerNight, double rating,
                  String resortType, boolean allInclusive, boolean hasSpa) {
        super(name, location, pricePerNight, rating);
        this.resortType = resortType;
        this.allInclusive = allInclusive;
        this.hasSpa = hasSpa;
    }

    /**
     * Displays resort-specific details along with base accommodation info.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Type         : " + resortType + " Resort");
        System.out.println("  All-Inclusive : " + (allInclusive ? "Yes" : "No"));
        System.out.println("  Spa          : " + (hasSpa ? "Available" : "Not Available"));
    }

    /**
     * Calculates the stay cost with a 10% surcharge for all-inclusive resorts.
     *
     * @param nights the number of nights
     * @return total cost in INR
     */
    @Override
    public double calculateStayCost(int nights) {
        double cost = super.calculateStayCost(nights);
        if (allInclusive) cost *= 1.10;
        return cost;
    }

    /**
     * Gets the resort type.
     * @return the resort type
     */
    public String getResortType() { return resortType; }
}
