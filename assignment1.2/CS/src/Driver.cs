using System;

class Driver {
    private int driverId;
    private string name;
    private string licenseNo;
    private bool isAvailable;

    public Driver(int driverId, string name, string licenseNo) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNo = licenseNo;
        this.isAvailable = true;
    }

    public bool AcceptTrip() {
        if (this.isAvailable) {
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    public void FinishTrip() {
        this.isAvailable = true;
    }

    public bool CheckAvailability() {
        return this.isAvailable;
    }

    public int GetDriverId() { return driverId; }
    public void SetDriverId(int driverId) { this.driverId = driverId; }

    public string GetName() { return name; }
    public void SetName(string name) { this.name = name; }

    public string GetLicenseNo() { return licenseNo; }
    public void SetLicenseNo(string licenseNo) { this.licenseNo = licenseNo; }
}
