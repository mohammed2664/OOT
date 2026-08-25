#ifndef DRIVER_H
#define DRIVER_H

#include <string>
using namespace std;

class Driver {
private:
    int driverId;
    string name;
    string licenseNo;
    bool isAvailable;

public:
    Driver(int driverId, string name, string licenseNo) {
        this->driverId = driverId;
        this->name = name;
        this->licenseNo = licenseNo;
        this->isAvailable = true;
    }

    bool acceptTrip() {
        if (this->isAvailable) {
            this->isAvailable = false;
            return true;
        }
        return false;
    }

    void finishTrip() {
        this->isAvailable = true;
    }

    bool checkAvailability() {
        return this->isAvailable;
    }

    int getDriverId() { return driverId; }
    void setDriverId(int driverId) { this->driverId = driverId; }

    string getName() { return name; }
    void setName(string name) { this->name = name; }

    string getLicenseNo() { return licenseNo; }
    void setLicenseNo(string licenseNo) { this->licenseNo = licenseNo; }
};

#endif
