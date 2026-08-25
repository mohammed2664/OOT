/**
 * Represents an adventure tour package that extends the base {@link TourPackage}.
 * Demonstrates <b>Single Inheritance</b> in the Tourism domain.
 *
 * <p>An adventure tour adds attributes such as activity type, difficulty level
 * and mandatory insurance to the basic tour package.</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 * @see TourPackage
 */
public class AdventureTourPackage extends TourPackage {

    /** The type of adventure activity (e.g., Trekking, Rafting, Paragliding) */
    private String adventureType;

    /** Difficulty level of the adventure (Easy, Moderate, Difficult) */
    private String difficultyLevel;

    /** Whether travel insurance is mandatory for this package */
    private boolean insuranceRequired;

    /**
     * Constructs an AdventureTourPackage with all details.
     *
     * @param packageName      the name of the package
     * @param destination      the tour destination
     * @param durationInDays   the duration in days
     * @param basePrice        the base price in INR
     * @param adventureType    the type of adventure activity
     * @param difficultyLevel  the difficulty level
     * @param insuranceRequired whether insurance is mandatory
     */
    public AdventureTourPackage(String packageName, String destination, int durationInDays,
                                double basePrice, String adventureType, String difficultyLevel,
                                boolean insuranceRequired) {
        super(packageName, destination, durationInDays, basePrice);
        this.adventureType = adventureType;
        this.difficultyLevel = difficultyLevel;
        this.insuranceRequired = insuranceRequired;
    }

    /**
     * Displays the full adventure tour details including base package information.
     */
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("  Adventure    : " + adventureType);
        System.out.println("  Difficulty   : " + difficultyLevel);
        System.out.println("  Insurance    : " + (insuranceRequired ? "Required" : "Optional"));
    }

    /**
     * Calculates the total cost including a risk premium based on difficulty level.
     * <ul>
     *   <li>Easy — no premium</li>
     *   <li>Moderate — 15% premium</li>
     *   <li>Difficult — 30% premium</li>
     * </ul>
     * An additional Rs. 2000 is charged if insurance is mandatory.
     *
     * @return the total calculated cost
     */
    @Override
    public double calculateCost() {
        double cost = super.calculateCost();
        switch (difficultyLevel.toLowerCase()) {
            case "moderate": cost *= 1.15; break;
            case "difficult": cost *= 1.30; break;
        }
        if (insuranceRequired) cost += 2000;
        return cost;
    }

    /**
     * Gets the adventure type.
     * @return the adventure type
     */
    public String getAdventureType() { return adventureType; }

    /**
     * Gets the difficulty level.
     * @return the difficulty level
     */
    public String getDifficultyLevel() { return difficultyLevel; }

    /**
     * Checks whether insurance is required.
     * @return true if insurance is mandatory
     */
    public boolean isInsuranceRequired() { return insuranceRequired; }
}
