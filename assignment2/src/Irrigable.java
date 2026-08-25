/**
 * Interface representing irrigable agricultural land.
 * Used in the <b>Multiple Inheritance</b> demonstration where a class
 * implements multiple interfaces.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public interface Irrigable {

    /**
     * Applies irrigation using the specified method.
     *
     * @param method the irrigation method (e.g., Drip, Sprinkler, Canal)
     */
    void irrigate(String method);

    /**
     * Gets the water requirement in litres per acre.
     *
     * @return the water requirement
     */
    double getWaterRequirement();
}
