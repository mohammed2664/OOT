#ifndef CUSTOMER_H
#define CUSTOMER_H

#include <iostream>
#include <string>
#include "Driver.h"
#include "Vehicle.h"
using namespace std;

// Forward declaration
class Trip;

class Customer {
private:
    int customerId;
    string name;
    string phone;
    string email;

public:
    Customer(int customerId, string name, string phone, string email) {
        this->customerId = customerId;
        this->name = name;
        this->phone = phone;
        this->email = email;
    }

    void registerCustomer() {
        cout << "Customer " << this->name << " successfully registered." << endl;
    }

    // requestTrip is implemented in Trip.h to avoid circular dependency
    Trip requestTrip(string pickup, string drop, Driver& driver, Vehicle& vehicle);

    string getDetails() {
        return this->name + " (" + this->phone + ")";
    }

    int getCustomerId() { return customerId; }
    void setCustomerId(int customerId) { this->customerId = customerId; }

    string getName() { return name; }
    void setName(string name) { this->name = name; }

    string getPhone() { return phone; }
    void setPhone(string phone) { this->phone = phone; }

    string getEmail() { return email; }
    void setEmail(string email) { this->email = email; }
};

#endif
