import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Welcome to the Transport Management System ---");

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine();

        Customer customer = new Customer(1, name, phone, email);

        Driver driver = new Driver(101, "Amit Singh", "GA-03-2021-9876");
        Vehicle vehicle = new Vehicle(501, "Sedan", "GA-07-AB-1234", 4);

        Admin admin = new Admin(1, "Mohammed", "System Administrator");

        System.out.println("\n--- Admin Actions ---\n");
        admin.approveDriver(driver);
        admin.addVehicle(vehicle);

        System.out.println("\n--- Processing Booking ---\n");

        customer.register();

        System.out.print("\nEnter Pickup Location: ");
        String pickup = scanner.nextLine();

        System.out.print("Enter Drop-off Location: ");
        String drop = scanner.nextLine();

        if (driver.checkAvailability()) {
            if (driver.acceptTrip()) {
                Trip currentTrip = customer.requestTrip(pickup, drop, driver, vehicle);

                System.out.println("\n--- Trip Details ---");
                currentTrip.startTrip();

                System.out.println("\n... traveling ...");

                currentTrip.completeTrip();
            }
        } else {
            System.out.println("Sorry, no drivers are currently available.");
        }

        scanner.close();
    }
}
