/**
 * Represents a homestay accommodation extending {@link Accommodation}.
 * One of the child classes in the <b>Hierarchical Inheritance</b> demonstration.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see Accommodation
 */
public class Homestay extends Accommodation {

    /** Name of the host */
    private String hostName;

    /** Whether home-cooked meals are provided */
    private boolean mealsProvided;

    /** Maximum number of guests allowed */
    private int maxGuests;

    /**
     * Constructs a Homestay with all details.
     *
     * @param name          the homestay name
     * @param location      the location
     * @param pricePerNight the price per night in INR
     * @param rating        the guest rating
     * @param hostName      the host's name
     * @param mealsProvided whether meals are provided
     * @param maxGuests     maximum guest capacity
     */
    public Homestay(String name, String location, double pricePerNight, double rating,
                    String hostName, boolean mealsProvided, int maxGuests) {
        super(name, location, pricePerNight, rating);
        this.hostName = hostName;
        this.mealsProvided = mealsProvided;
        this.maxGuests = maxGuests;
    }

    /**
     * Displays homestay-specific details along with base accommodation info.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Type         : Homestay");
        System.out.println("  Host         : " + hostName);
        System.out.println("  Meals        : " + (mealsProvided ? "Home-Cooked Meals" : "Self-Catering"));
        System.out.println("  Max Guests   : " + maxGuests);
    }

    /**
     * Gets the host name.
     * @return the host name
     */
    public String getHostName() { return hostName; }

    /**
     * Checks if meals are provided.
     * @return true if meals are provided
     */
    public boolean isMealsProvided() { return mealsProvided; }

    /**
     * Gets the maximum guest capacity.
     * @return maximum guests allowed
     */
    public int getMaxGuests() { return maxGuests; }
}
