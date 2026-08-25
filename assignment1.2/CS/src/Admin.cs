using System;

class Admin {
    private int adminId;
    private string name;
    private string role;

    public Admin(int adminId, string name, string role) {
        this.adminId = adminId;
        this.name = name;
        this.role = role;
    }

    public void AddVehicle(Vehicle v) {
        Console.WriteLine("Admin " + this.name + " added vehicle: " + v.GetVehicleDetails() + " to the system.");
    }

    public void ApproveDriver(Driver d) {
        Console.WriteLine("Admin " + this.name + " approved driver: " + d.GetName() + " (License: " + d.GetLicenseNo() + ").");
    }

    public int GetAdminId() { return adminId; }
    public void SetAdminId(int adminId) { this.adminId = adminId; }

    public string GetName() { return name; }
    public void SetName(string name) { this.name = name; }

    public string GetRole() { return role; }
    public void SetRole(string role) { this.role = role; }
}
