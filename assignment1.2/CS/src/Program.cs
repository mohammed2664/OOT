using System;

class Program {
    static void Main(string[] args) {
        Console.WriteLine("--- Welcome to the Transport Management System ---");

        Console.Write("Enter your Name: ");
        string name = Console.ReadLine();

        Console.Write("Enter your Phone Number: ");
        string phone = Console.ReadLine();

        Console.Write("Enter your Email: ");
        string email = Console.ReadLine();

        Customer customer = new Customer(1, name, phone, email);

        Driver driver = new Driver(101, "Amit Singh", "GA-03-2021-9876");
        Vehicle vehicle = new Vehicle(501, "Sedan", "GA-07-AB-1234", 4);

        Admin admin = new Admin(1, "Mohammed", "System Administrator");

        Console.WriteLine("\n--- Admin Actions ---\n");
        admin.ApproveDriver(driver);
        admin.AddVehicle(vehicle);

        Console.WriteLine("\n--- Processing Booking ---\n");

        customer.Register();

        Console.Write("\nEnter Pickup Location: ");
        string pickup = Console.ReadLine();

        Console.Write("Enter Drop-off Location: ");
        string drop = Console.ReadLine();

        if (driver.CheckAvailability()) {
            if (driver.AcceptTrip()) {
                Trip currentTrip = customer.RequestTrip(pickup, drop, driver, vehicle);

                Console.WriteLine("\n--- Trip Details ---");
                currentTrip.StartTrip();

                Console.WriteLine("\n... traveling ...");

                currentTrip.CompleteTrip();
            }
        } else {
            Console.WriteLine("Sorry, no drivers are currently available.");
        }
    }
}
