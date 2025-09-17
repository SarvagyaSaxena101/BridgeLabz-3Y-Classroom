package PillarsOfOOPS;

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public abstract double calculateFare(double distance);
    public String getVehicleDetails() { return vehicleId + ", " + driverName + ", " + ratePerKm; }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class CarRide extends RideVehicle implements GPS {
    private String location;
    public CarRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Start";
    }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

class BikeRide extends RideVehicle implements GPS {
    private String location;
    public BikeRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Start";
    }
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

class AutoRide extends RideVehicle implements GPS {
    private String location;
    public AutoRide(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.location = "Start";
    }
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.9; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        RideVehicle[] rides = new RideVehicle[3];
        rides[0] = new CarRide("V1", "Alice", 20);
        rides[1] = new BikeRide("V2", "Bob", 10);
        rides[2] = new AutoRide("V3", "Charlie", 15);
        for (RideVehicle r : rides) {
            System.out.println(r.getVehicleDetails() + " Fare for 10km: " + r.calculateFare(10));
        }
    }
}
