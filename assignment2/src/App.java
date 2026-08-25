import java.util.Scanner;

/**
 * Main application class for the Tourism and Agriculture Inheritance Demonstration.
 * Provides a menu-driven interface to navigate through all five types of inheritance:
 *
 * <ol>
 *   <li><b>Single Inheritance</b> — Tourism: {@link TourPackage} → {@link AdventureTourPackage}</li>
 *   <li><b>Multilevel Inheritance</b> — Agriculture: {@link Crop} → {@link FoodGrain} → {@link OrganicFoodGrain}</li>
 *   <li><b>Hierarchical Inheritance</b> — Tourism: {@link Accommodation} → {@link Hotel}, {@link Resort}, {@link Homestay}</li>
 *   <li><b>Multiple Inheritance</b> — Agriculture: {@link FarmLand} implements {@link Irrigable}, {@link Insurable}</li>
 *   <li><b>Hybrid Inheritance</b> — Agro-Tourism: {@link SustainableAgroTourism} extends {@link AgroTourismVenture} implements {@link EcoFriendly}</li>
 * </ol>
 *
 * <p><b>Assignment 2</b> — Object Oriented Technologies Lab, MCA</p>
 *
 * @author Mohammed Faaris Khan
 * @version 1.0
 */
public class App {

    /** Scanner instance for user input */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Entry point of the application. Displays the main menu and routes
     * the user to the selected inheritance demonstration.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int choice;

        System.out.println("=========================================================");
        System.out.println("   TOURISM & AGRICULTURE — Inheritance Demonstration");
        System.out.println("   Roll No: 2664 | Mohammed Faaris Khan | Batch B2");
        System.out.println("=========================================================");

        do {
            System.out.println("\n---------------------------------------------------------");
            System.out.println("                       MAIN MENU");
            System.out.println("---------------------------------------------------------");
            System.out.println("  1. Single Inheritance       (Tourism)");
            System.out.println("  2. Multilevel Inheritance   (Agriculture)");
            System.out.println("  3. Hierarchical Inheritance (Tourism)");
            System.out.println("  4. Multiple Inheritance     (Agriculture)");
            System.out.println("  5. Hybrid Inheritance       (Agro-Tourism)");
            System.out.println("  0. Exit");
            System.out.println("---------------------------------------------------------");
            System.out.print("  Enter your choice: ");
            choice = readInt();

            switch (choice) {
                case 1: demoSingleInheritance(); break;
                case 2: demoMultilevelInheritance(); break;
                case 3: demoHierarchicalInheritance(); break;
                case 4: demoMultipleInheritance(); break;
                case 5: demoHybridInheritance(); break;
                case 0: System.out.println("\n  Thank you! Exiting..."); break;
                default: System.out.println("  Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    /**
     * Demonstrates Single Inheritance using Tourism domain.
     * {@link TourPackage} (parent) → {@link AdventureTourPackage} (child).
     */
    private static void demoSingleInheritance() {
        System.out.println("\n=========================================================");
        System.out.println("  1. SINGLE INHERITANCE — Tour Packages (Tourism)");
        System.out.println("     TourPackage  -->  AdventureTourPackage");
        System.out.println("=========================================================");

        System.out.print("\n  Enter package name: ");
        String name = scanner.nextLine();
        System.out.print("  Enter destination: ");
        String dest = scanner.nextLine();
        System.out.print("  Enter duration (days): ");
        int days = readInt();
        System.out.print("  Enter base price (Rs.): ");
        double price = readDouble();
        System.out.print("  Enter adventure type (Trekking/Rafting/Paragliding): ");
        String type = scanner.nextLine();
        System.out.print("  Enter difficulty (Easy/Moderate/Difficult): ");
        String diff = scanner.nextLine();
        System.out.print("  Insurance required? (yes/no): ");
        boolean ins = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.println("\n--- Base Tour Package ---");
        TourPackage base = new TourPackage(name, dest, days, price);
        base.displayDetails();
        System.out.println("  Total Cost   : Rs. " + String.format("%.2f", base.calculateCost()));

        System.out.println("\n--- Adventure Tour Package (inherits TourPackage) ---");
        AdventureTourPackage adv = new AdventureTourPackage(name, dest, days, price, type, diff, ins);
        adv.displayDetails();
        System.out.println("  Total Cost   : Rs. " + String.format("%.2f", adv.calculateCost()));
    }

    /**
     * Demonstrates Multilevel Inheritance using Agriculture domain.
     * {@link Crop} → {@link FoodGrain} → {@link OrganicFoodGrain}.
     */
    private static void demoMultilevelInheritance() {
        System.out.println("\n=========================================================");
        System.out.println("  2. MULTILEVEL INHERITANCE — Crops (Agriculture)");
        System.out.println("     Crop  -->  FoodGrain  -->  OrganicFoodGrain");
        System.out.println("=========================================================");

        System.out.print("\n  Enter crop name: ");
        String cropName = scanner.nextLine();
        System.out.print("  Enter season (Kharif/Rabi/Zaid): ");
        String season = scanner.nextLine();
        System.out.print("  Enter yield per acre (quintals): ");
        double yield = readDouble();
        System.out.print("  Enter grain type (Cereal/Pulse/Millet): ");
        String grainType = scanner.nextLine();
        System.out.print("  Enter protein content (%): ");
        double protein = readDouble();
        System.out.print("  Enter MSP (Rs./quintal): ");
        double msp = readDouble();
        System.out.print("  Enter certification body: ");
        String cert = scanner.nextLine();
        System.out.print("  Pesticide-free? (yes/no): ");
        boolean pestFree = scanner.nextLine().trim().equalsIgnoreCase("yes");
        System.out.print("  Enter organic premium (%): ");
        double premium = readDouble();

        System.out.println("\n--- Level 1: Crop ---");
        Crop crop = new Crop(cropName, season, yield);
        crop.displayInfo();

        System.out.println("\n--- Level 2: FoodGrain (inherits Crop) ---");
        FoodGrain fg = new FoodGrain(cropName, season, yield, grainType, protein, msp);
        fg.displayInfo();
        System.out.println("  Est. Revenue : Rs. " + String.format("%.2f", fg.estimateRevenue()) + "/acre");

        System.out.println("\n--- Level 3: OrganicFoodGrain (inherits FoodGrain) ---");
        OrganicFoodGrain ofg = new OrganicFoodGrain(cropName, season, yield, grainType, protein, msp, cert, pestFree, premium);
        ofg.displayInfo();
        System.out.println("  Est. Revenue : Rs. " + String.format("%.2f", ofg.estimateRevenue()) + "/acre (with organic premium)");
    }

    /**
     * Demonstrates Hierarchical Inheritance using Tourism domain.
     * {@link Accommodation} → {@link Hotel}, {@link Resort}, {@link Homestay}.
     */
    private static void demoHierarchicalInheritance() {
        System.out.println("\n=========================================================");
        System.out.println("  3. HIERARCHICAL INHERITANCE — Accommodations (Tourism)");
        System.out.println("              Accommodation");
        System.out.println("             /      |      \\");
        System.out.println("          Hotel   Resort  Homestay");
        System.out.println("=========================================================");

        Hotel hotel = new Hotel("Taj Vivanta", "Panaji, Goa", 8500, 4.5,
                5, true, true);
        Resort resort = new Resort("Club Mahindra", "Coorg, Karnataka", 12000, 4.3,
                "Hill Station", true, true);
        Homestay homestay = new Homestay("Casa de Goa", "Anjuna, Goa", 2500, 4.7,
                "Mrs. Fernandes", true, 6);

        System.out.println("\n--- Hotel (extends Accommodation) ---");
        hotel.displayDetails();

        System.out.println("\n--- Resort (extends Accommodation) ---");
        resort.displayDetails();

        System.out.println("\n--- Homestay (extends Accommodation) ---");
        homestay.displayDetails();

        System.out.print("\n  Enter number of nights for cost comparison: ");
        int nights = readInt();

        System.out.println("\n--- Cost Comparison for " + nights + " night(s) ---");
        System.out.println("  Hotel    : Rs. " + String.format("%.2f", hotel.calculateStayCost(nights)));
        System.out.println("  Resort   : Rs. " + String.format("%.2f", resort.calculateStayCost(nights)));
        System.out.println("  Homestay : Rs. " + String.format("%.2f", homestay.calculateStayCost(nights)));
    }

    /**
     * Demonstrates Multiple Inheritance using Agriculture domain.
     * {@link FarmLand} implements {@link Irrigable} and {@link Insurable}.
     */
    private static void demoMultipleInheritance() {
        System.out.println("\n=========================================================");
        System.out.println("  4. MULTIPLE INHERITANCE — Farm Land (Agriculture)");
        System.out.println("     Irrigable (interface) --+");
        System.out.println("                             +--> FarmLand");
        System.out.println("     Insurable (interface) --+");
        System.out.println("=========================================================");

        System.out.print("\n  Enter farm location: ");
        String loc = scanner.nextLine();
        System.out.print("  Enter area (acres): ");
        double area = readDouble();
        System.out.print("  Enter soil type (Alluvial/Black/Red/Laterite): ");
        String soil = scanner.nextLine();
        System.out.print("  Enter current crop: ");
        String crop = scanner.nextLine();
        System.out.print("  Enter land value (Rs./acre): ");
        double value = readDouble();

        FarmLand farm = new FarmLand(loc, area, soil, crop, value);

        System.out.println("\n--- Farm Land Details ---");
        farm.displayDetails();

        System.out.println("\n--- Irrigable Interface Methods ---");
        System.out.print("  Enter irrigation method (Drip/Sprinkler/Canal): ");
        String method = scanner.nextLine();
        farm.irrigate(method);
        System.out.println("  Water Requirement: " + String.format("%.0f", farm.getWaterRequirement()) + " litres/day");

        System.out.println("\n--- Insurable Interface Methods ---");
        System.out.println("  Policy     : " + farm.getPolicyDetails());
        System.out.println("  Premium    : Rs. " + String.format("%.2f", farm.calculatePremium()) + "/year");
    }

    /**
     * Demonstrates Hybrid Inheritance combining Tourism and Agriculture.
     * {@link Business} → {@link AgroTourismVenture} (hierarchical)
     * + {@link EcoFriendly} interface (multiple) → {@link SustainableAgroTourism}.
     */
    private static void demoHybridInheritance() {
        System.out.println("\n=========================================================");
        System.out.println("  5. HYBRID INHERITANCE — Sustainable Agro-Tourism");
        System.out.println("          Business (class)");
        System.out.println("         /              \\");
        System.out.println("  AgroTourismVenture  TourOperator  (Hierarchical)");
        System.out.println("         |");
        System.out.println("  SustainableAgroTourism  <-- EcoFriendly (Interface)");
        System.out.println("         (Hybrid = Hierarchical + Multiple)");
        System.out.println("=========================================================");

        TourOperator tourOp = new TourOperator("Goa Explorers Pvt. Ltd.", "Rahul Verma",
                4500000, 12, "Goa & Karnataka");

        SustainableAgroTourism sat = new SustainableAgroTourism(
                "Green Roots Agro-Tourism", "Priya Naik", 3200000,
                "Plantation", 25, 350, 3.5, true, true);

        System.out.println("\n--- TourOperator (extends Business) ---");
        tourOp.displayDetails();

        System.out.println("\n--- SustainableAgroTourism (extends AgroTourismVenture + EcoFriendly) ---");
        sat.displayDetails();

        System.out.println();
        sat.displayEcoPractices();
    }

    /**
     * Reads an integer from the user, with error handling.
     *
     * @return the integer entered by the user
     */
    private static int readInt() {
        while (true) {
            try {
                int val = Integer.parseInt(scanner.nextLine().trim());
                return val;
            } catch (NumberFormatException e) {
                System.out.print("  Invalid input. Enter a number: ");
            }
        }
    }

    /**
     * Reads a double from the user, with error handling.
     *
     * @return the double entered by the user
     */
    private static double readDouble() {
        while (true) {
            try {
                double val = Double.parseDouble(scanner.nextLine().trim());
                return val;
            } catch (NumberFormatException e) {
                System.out.print("  Invalid input. Enter a number: ");
            }
        }
    }
}
