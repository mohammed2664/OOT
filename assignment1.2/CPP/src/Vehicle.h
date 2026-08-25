#ifndef VEHICLE_H
#define VEHICLE_H

#include <string>
using namespace std;

class Vehicle {
private:
    int vehicleId;
    string type;
    string plateNumber;
    int capacity;

public:
    Vehicle(int vehicleId, string type, string plateNumber, int capacity) {
        this->vehicleId = vehicleId;
        this->type = type;
        this->plateNumber = plateNumber;
        this->capacity = capacity;
    }

    string getVehicleDetails() {
        return this->type + " [" + this->plateNumber + "]";
    }

    int getVehicleId() { return vehicleId; }
    void setVehicleId(int vehicleId) { this->vehicleId = vehicleId; }

    string getType() { return type; }
    void setType(string type) { this->type = type; }

    string getPlateNumber() { return plateNumber; }
    void setPlateNumber(string plateNumber) { this->plateNumber = plateNumber; }

    int getCapacity() { return capacity; }
    void setCapacity(int capacity) { this->capacity = capacity; }
};

#endif
