from driver import Driver
from vehicle import Vehicle
from trip import Trip


class Customer:
    def __init__(self, customer_id, name, phone, email):
        self.__customer_id = customer_id
        self.__name = name
        self.__phone = phone
        self.__email = email

    def register(self):
        print("Customer " + self.__name + " successfully registered.")

    def request_trip(self, pickup, drop, driver, vehicle):
        return Trip(1001, self, driver, vehicle, pickup, drop)

    def get_details(self):
        return self.__name + " (" + self.__phone + ")"

    def get_customer_id(self):
        return self.__customer_id

    def set_customer_id(self, customer_id):
        self.__customer_id = customer_id

    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_phone(self):
        return self.__phone

    def set_phone(self, phone):
        self.__phone = phone

    def get_email(self):
        return self.__email

    def set_email(self, email):
        self.__email = email
