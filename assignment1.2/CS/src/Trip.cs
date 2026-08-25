using System;

class Trip {
    private int tripId;
    private Customer customer;
    private Driver driver;
    private Vehicle vehicle;
    private string pickupLocation;
    private string dropLocation;
    private float totalFare;

    public Trip(int tripId, Customer customer, Driver driver, Vehicle vehicle, string pickupLocation, string dropLocation) {
        this.tripId = tripId;
        this.customer = customer;
        this.driver = driver;
        this.vehicle = vehicle;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    public float CalculateFare() {
        this.totalFare = 450.50f;
        return this.totalFare;
    }

    public void StartTrip() {
        Console.WriteLine("Trip " + this.tripId + " started.");
        Console.WriteLine("Passenger: " + this.customer.GetDetails());
        Console.WriteLine("Driver: " + this.driver.GetName() + " | Vehicle: " + this.vehicle.GetVehicleDetails());
        Console.WriteLine("Route: " + this.pickupLocation + " -> " + this.dropLocation);
    }

    public void CompleteTrip() {
        Console.WriteLine("Trip " + this.tripId + " completed successfully. Total Fare: Rs." + CalculateFare());
        this.driver.FinishTrip();
    }

    public int GetTripId() { return tripId; }
    public void SetTripId(int tripId) { this.tripId = tripId; }

    public string GetPickupLocation() { return pickupLocation; }
    public void SetPickupLocation(string pickupLocation) { this.pickupLocation = pickupLocation; }

    public string GetDropLocation() { return dropLocation; }
    public void SetDropLocation(string dropLocation) { this.dropLocation = dropLocation; }
}
