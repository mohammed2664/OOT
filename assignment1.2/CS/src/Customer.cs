using System;

class Customer {
    private int customerId;
    private string name;
    private string phone;
    private string email;

    public Customer(int customerId, string name, string phone, string email) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void Register() {
        Console.WriteLine("Customer " + this.name + " successfully registered.");
    }

    public Trip RequestTrip(string pickup, string drop, Driver driver, Vehicle vehicle) {
        return new Trip(1001, this, driver, vehicle, pickup, drop);
    }

    public string GetDetails() {
        return this.name + " (" + this.phone + ")";
    }

    public int GetCustomerId() { return customerId; }
    public void SetCustomerId(int customerId) { this.customerId = customerId; }

    public string GetName() { return name; }
    public void SetName(string name) { this.name = name; }

    public string GetPhone() { return phone; }
    public void SetPhone(string phone) { this.phone = phone; }

    public string GetEmail() { return email; }
    public void SetEmail(string email) { this.email = email; }
}
