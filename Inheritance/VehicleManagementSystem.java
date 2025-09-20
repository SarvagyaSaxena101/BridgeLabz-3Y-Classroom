interface Refuelable {
    void refuel();
}

class Vehicle {
    private int maxSpeed;
    private String model;
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public int getMaxSpeed() { return maxSpeed; }
    public String getModel() { return model; }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    public void charge() { System.out.println("Charging electric vehicle"); }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
    public void refuel() { System.out.println("Refueling petrol vehicle"); }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda");
        ev.charge();
        pv.refuel();
    }
}
