from admin import Admin
from customer import Customer
from driver import Driver
from trip import Trip
from vehicle import Vehicle


def main():
    print("--- Welcome to the Transport Management System ---")

    name = input("Enter your Name: ")
    phone = input("Enter your Phone Number: ")
    email = input("Enter your Email: ")

    customer = Customer(1, name, phone, email)

    driver = Driver(101, "Amit Singh", "GA-03-2021-9876")
    vehicle = Vehicle(501, "Sedan", "GA-07-AB-1234", 4)

    admin = Admin(1, "Mohammed", "System Administrator")

    print("\n--- Admin Actions ---\n")
    admin.approve_driver(driver)
    admin.add_vehicle(vehicle)

    print("\n--- Processing Booking ---\n")

    customer.register()

    pickup = input("\nEnter Pickup Location: ")
    drop = input("Enter Drop-off Location: ")

    if driver.check_availability():
        if driver.accept_trip():
            current_trip = customer.request_trip(pickup, drop, driver, vehicle)

            print("\n--- Trip Details ---")
            current_trip.start_trip()

            print("\n... traveling ...")

            current_trip.complete_trip()
    else:
        print("Sorry, no drivers are currently available.")


if __name__ == "__main__":
    main()
