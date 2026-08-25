#ifndef ADMIN_H
#define ADMIN_H

#include <iostream>
#include <string>
#include "Vehicle.h"
#include "Driver.h"
using namespace std;

class Admin {
private:
    int adminId;
    string name;
    string role;

public:
    Admin(int adminId, string name, string role) {
        this->adminId = adminId;
        this->name = name;
        this->role = role;
    }

    void addVehicle(Vehicle& v) {
        cout << "Admin " << this->name << " added vehicle: " << v.getVehicleDetails() << " to the system." << endl;
    }

    void approveDriver(Driver& d) {
        cout << "Admin " << this->name << " approved driver: " << d.getName() << " (License: " << d.getLicenseNo() << ")." << endl;
    }

    int getAdminId() { return adminId; }
    void setAdminId(int adminId) { this->adminId = adminId; }

    string getName() { return name; }
    void setName(string name) { this->name = name; }

    string getRole() { return role; }
    void setRole(string role) { this->role = role; }
};

#endif
