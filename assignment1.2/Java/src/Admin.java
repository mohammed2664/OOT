public class Admin {
    private int adminId;
    private String name;
    private String role;

    public Admin(int adminId, String name, String role) {
        this.adminId = adminId;
        this.name = name;
        this.role = role;
    }

    public void addVehicle(Vehicle v) {
        System.out.println("Admin " + this.name + " added vehicle: " + v.getVehicleDetails() + " to the system.");
    }

    public void approveDriver(Driver d) {
        System.out.println("Admin " + this.name + " approved driver: " + d.getName() + " (License: " + d.getLicenseNo() + ").");
    }

    public int getAdminId() { return adminId; }
    public void setAdminId(int adminId) { this.adminId = adminId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
