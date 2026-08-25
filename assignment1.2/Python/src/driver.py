class Driver:
    def __init__(self, driver_id, name, license_no):
        self.__driver_id = driver_id
        self.__name = name
        self.__license_no = license_no
        self.__is_available = True

    def accept_trip(self):
        if self.__is_available:
            self.__is_available = False
            return True
        return False

    def finish_trip(self):
        self.__is_available = True

    def check_availability(self):
        return self.__is_available

    def get_driver_id(self):
        return self.__driver_id

    def set_driver_id(self, driver_id):
        self.__driver_id = driver_id

    def get_name(self):
        return self.__name

    def set_name(self, name):
        self.__name = name

    def get_license_no(self):
        return self.__license_no

    def set_license_no(self, license_no):
        self.__license_no = license_no
