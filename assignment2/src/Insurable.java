/**
 * Interface representing insurable agricultural property.
 * Used in the <b>Multiple Inheritance</b> demonstration where a class
 * implements multiple interfaces.
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public interface Insurable {

    /**
     * Calculates the insurance premium for the property.
     *
     * @return the premium amount in INR
     */
    double calculatePremium();

    /**
     * Gets the insurance policy details as a formatted string.
     *
     * @return the policy details
     */
    String getPolicyDetails();
}
