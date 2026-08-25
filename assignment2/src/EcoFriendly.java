/**
 * Interface representing eco-friendly business practices.
 * Used in the <b>Hybrid Inheritance</b> demonstration to add the multiple
 * inheritance aspect on top of the hierarchical class hierarchy.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public interface EcoFriendly {

    /**
     * Gets the carbon footprint of the business in tonnes of CO2 per year.
     *
     * @return the carbon footprint
     */
    double getCarbonFootprint();

    /**
     * Gets the sustainability rating (Gold, Silver, Bronze).
     *
     * @return the sustainability rating
     */
    String getSustainabilityRating();

    /**
     * Displays eco-friendly practices followed by the business.
     */
    void displayEcoPractices();
}
