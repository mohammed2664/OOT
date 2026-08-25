public class Trip {
    private int tripId;
    private Customer customer;
    private Driver driver;
    private Vehicle vehicle;
    private String pickupLocation;
    private String dropLocation;
    private float totalFare;

    public Trip(int tripId, Customer customer, Driver driver, Vehicle vehicle, String pickupLocation, String dropLocation) {
        this.tripId = tripId;
        this.customer = customer;
        this.driver = driver;
        this.vehicle = vehicle;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    public float calculateFare() {
        this.totalFare = 450.50f;
        return this.totalFare;
    }

    public void startTrip() {
        System.out.println("Trip " + this.tripId + " started.");
        System.out.println("Passenger: " + this.customer.getDetails());
        System.out.println("Driver: " + this.driver.getName() + " | Vehicle: " + this.vehicle.getVehicleDetails());
        System.out.println("Route: " + this.pickupLocation + " -> " + this.dropLocation);
    }

    public void completeTrip() {
        System.out.println("Trip " + this.tripId + " completed successfully. Total Fare: Rs." + calculateFare());
        this.driver.finishTrip();
    }

    public int getTripId() { return tripId; }
    public void setTripId(int tripId) { this.tripId = tripId; }

    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getDropLocation() { return dropLocation; }
    public void setDropLocation(String dropLocation) { this.dropLocation = dropLocation; }
}
