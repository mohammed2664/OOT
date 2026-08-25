#ifndef TRIP_H
#define TRIP_H

#include <iostream>
#include <string>
#include "Customer.h"
#include "Driver.h"
#include "Vehicle.h"
using namespace std;

class Trip {
private:
    int tripId;
    Customer* customer;
    Driver* driver;
    Vehicle* vehicle;
    string pickupLocation;
    string dropLocation;
    float totalFare;

public:
    Trip(int tripId, Customer* customer, Driver* driver, Vehicle* vehicle, string pickupLocation, string dropLocation) {
        this->tripId = tripId;
        this->customer = customer;
        this->driver = driver;
        this->vehicle = vehicle;
        this->pickupLocation = pickupLocation;
        this->dropLocation = dropLocation;
        this->totalFare = 0.0f;
    }

    float calculateFare() {
        this->totalFare = 450.50f;
        return this->totalFare;
    }

    void startTrip() {
        cout << "Trip " << this->tripId << " started." << endl;
        cout << "Passenger: " << this->customer->getDetails() << endl;
        cout << "Driver: " << this->driver->getName() << " | Vehicle: " << this->vehicle->getVehicleDetails() << endl;
        cout << "Route: " << this->pickupLocation << " -> " << this->dropLocation << endl;
    }

    void completeTrip() {
        cout << "Trip " << this->tripId << " completed successfully. Total Fare: Rs." << calculateFare() << endl;
        this->driver->finishTrip();
    }

    int getTripId() { return tripId; }
    void setTripId(int tripId) { this->tripId = tripId; }

    string getPickupLocation() { return pickupLocation; }
    void setPickupLocation(string pickupLocation) { this->pickupLocation = pickupLocation; }

    string getDropLocation() { return dropLocation; }
    void setDropLocation(string dropLocation) { this->dropLocation = dropLocation; }
};

// Implementation of Customer::requestTrip (defined here to resolve circular dependency)
inline Trip Customer::requestTrip(string pickup, string drop, Driver& driver, Vehicle& vehicle) {
    return Trip(1001, this, &driver, &vehicle, pickup, drop);
}

#endif
