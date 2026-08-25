using System;

class Vehicle {
    private int vehicleId;
    private string type;
    private string plateNumber;
    private int capacity;

    public Vehicle(int vehicleId, string type, string plateNumber, int capacity) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.plateNumber = plateNumber;
        this.capacity = capacity;
    }

    public string GetVehicleDetails() {
        return this.type + " [" + this.plateNumber + "]";
    }

    public int GetVehicleId() { return vehicleId; }
    public void SetVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public string GetType() { return type; }
    public void SetType(string type) { this.type = type; }

    public string GetPlateNumber() { return plateNumber; }
    public void SetPlateNumber(string plateNumber) { this.plateNumber = plateNumber; }

    public int GetCapacity() { return capacity; }
    public void SetCapacity(int capacity) { this.capacity = capacity; }
}
