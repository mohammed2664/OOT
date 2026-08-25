#include <iostream>
#include <string>
#include "Admin.h"
#include "Customer.h"
#include "Driver.h"
#include "Trip.h"
#include "Vehicle.h"
using namespace std;

int main() {
    cout << "--- Welcome to the Transport Management System ---" << endl;

    string name, phone, email;

    cout << "Enter your Name: ";
    getline(cin, name);

    cout << "Enter your Phone Number: ";
    getline(cin, phone);

    cout << "Enter your Email: ";
    getline(cin, email);

    Customer customer(1, name, phone, email);

    Driver driver(101, "Amit Singh", "GA-03-2021-9876");
    Vehicle vehicle(501, "Sedan", "GA-07-AB-1234", 4);

    Admin admin(1, "Mohammed", "System Administrator");

    cout << "\n--- Admin Actions ---\n" << endl;
    admin.approveDriver(driver);
    admin.addVehicle(vehicle);

    cout << "\n--- Processing Booking ---\n" << endl;

    customer.registerCustomer();

    string pickup, drop;

    cout << "\nEnter Pickup Location: ";
    getline(cin, pickup);

    cout << "Enter Drop-off Location: ";
    getline(cin, drop);

    if (driver.checkAvailability()) {
        if (driver.acceptTrip()) {
            Trip currentTrip = customer.requestTrip(pickup, drop, driver, vehicle);

            cout << "\n--- Trip Details ---" << endl;
            currentTrip.startTrip();

            cout << "\n... traveling ..." << endl;

            currentTrip.completeTrip();
        }
    } else {
        cout << "Sorry, no drivers are currently available." << endl;
    }

    return 0;
}
