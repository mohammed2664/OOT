class Vehicle:
    def __init__(self, vehicle_id, type, plate_number, capacity):
        self.__vehicle_id = vehicle_id
        self.__type = type
        self.__plate_number = plate_number
        self.__capacity = capacity

    def get_vehicle_details(self):
        return self.__type + " [" + self.__plate_number + "]"

    def get_vehicle_id(self):
        return self.__vehicle_id

    def set_vehicle_id(self, vehicle_id):
        self.__vehicle_id = vehicle_id

    def get_type(self):
        return self.__type

    def set_type(self, type):
        self.__type = type

    def get_plate_number(self):
        return self.__plate_number

    def set_plate_number(self, plate_number):
        self.__plate_number = plate_number

    def get_capacity(self):
        return self.__capacity

    def set_capacity(self, capacity):
        self.__capacity = capacity
