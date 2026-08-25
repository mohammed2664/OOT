class Trip:
    def __init__(self, trip_id, customer, driver, vehicle, pickup_location, drop_location):
        self.__trip_id = trip_id
        self.__customer = customer
        self.__driver = driver
        self.__vehicle = vehicle
        self.__pickup_location = pickup_location
        self.__drop_location = drop_location
        self.__total_fare = 0.0

    def calculate_fare(self):
        self.__total_fare = 450.50
        return self.__total_fare

    def start_trip(self):
        print("Trip " + str(self.__trip_id) + " started.")
        print("Passenger: " + self.__customer.get_details())
        print("Driver: " + self.__driver.get_name() + " | Vehicle: " + self.__vehicle.get_vehicle_details())
        print("Route: " + self.__pickup_location + " -> " + self.__drop_location)

    def complete_trip(self):
        print("Trip " + str(self.__trip_id) + " completed successfully. Total Fare: Rs." + str(self.calculate_fare()))
        self.__driver.finish_trip()

    def get_trip_id(self):
        return self.__trip_id

    def set_trip_id(self, trip_id):
        self.__trip_id = trip_id

    def get_pickup_location(self):
        return self.__pickup_location

    def set_pickup_location(self, pickup_location):
        self.__pickup_location = pickup_location

    def get_drop_location(self):
        return self.__drop_location

    def set_drop_location(self, drop_location):
        self.__drop_location = drop_location
