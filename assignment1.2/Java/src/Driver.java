public class Driver {
    private int driverId;
    private String name;
    private String licenseNo;
    private boolean isAvailable;

    public Driver(int driverId, String name, String licenseNo) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNo = licenseNo;
        this.isAvailable = true;
    }

    public boolean acceptTrip() {
        if (this.isAvailable) {
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    public void finishTrip() {
        this.isAvailable = true;
    }

    public boolean checkAvailability() {
        return this.isAvailable;
    }

    public int getDriverId() { return driverId; }
    public void setDriverId(int driverId) { this.driverId = driverId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLicenseNo() { return licenseNo; }
    public void setLicenseNo(String licenseNo) { this.licenseNo = licenseNo; }
}
