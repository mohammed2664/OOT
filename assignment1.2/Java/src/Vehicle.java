public class Vehicle {
    private int vehicleId;
    private String type;
    private String plateNumber;
    private int capacity;

    public Vehicle(int vehicleId, String type, String plateNumber, int capacity) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.plateNumber = plateNumber;
        this.capacity = capacity;
    }

    public String getVehicleDetails() {
        return this.type + " [" + this.plateNumber + "]";
    }

    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
}
