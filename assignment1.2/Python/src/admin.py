from vehicle import Vehicle
from driver import Driver


class Admin:
    def __init__(self, admin_id, name, role):
        self.__admin_id = admin_id
        self.__name = name
        self.__role = role

    def add_vehicle(self, v):
        print("Admin " + self.__name + " added vehicle: " + v.get_vehicle_details() + " to the system.")

    def approve_driver(self, d):
        print("Admin " + self.__name + " approved driver: " + d.get_name() + " (License: " + d.get_license_no() + ").")

    def get_admin_id(self):
        return self.__admin_id

    def set_admin_id(self, admin_id):
        self.__admin_id = admin_id

    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_role(self):
        return self.__role

    def set_role(self, role):
        self.__role = role
