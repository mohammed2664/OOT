/**
 * Represents a hotel accommodation extending {@link Accommodation}.
 * One of the child classes in the <b>Hierarchical Inheritance</b> demonstration.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Accommodation
 */
public class Hotel extends Accommodation {

    /** Star rating of the hotel (1-5) */
    private int starRating;

    /** Whether the hotel has a swimming pool */
    private boolean hasPool;

    /** Whether complimentary breakfast is included */
    private boolean breakfastIncluded;

    /**
     * Constructs a Hotel with all details.
     *
     * @param name              the hotel name
     * @param location          the location
     * @param pricePerNight     the price per night in INR
     * @param rating            the guest rating
     * @param starRating        the star rating (1-5)
     * @param hasPool           whether the hotel has a pool
     * @param breakfastIncluded whether breakfast is included
     */
    public Hotel(String name, String location, double pricePerNight, double rating,
                 int starRating, boolean hasPool, boolean breakfastIncluded) {
        super(name, location, pricePerNight, rating);
        this.starRating = starRating;
        this.hasPool = hasPool;
        this.breakfastIncluded = breakfastIncluded;
    }

    /**
     * Displays hotel-specific details along with base accommodation info.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Type         : Hotel (" + starRating + "-Star)");
        System.out.println("  Pool         : " + (hasPool ? "Yes" : "No"));
        System.out.println("  Breakfast    : " + (breakfastIncluded ? "Included" : "Not Included"));
    }

    /**
     * Gets the star rating.
     * @return star rating (1-5)
     */
    public int getStarRating() { return starRating; }
}
