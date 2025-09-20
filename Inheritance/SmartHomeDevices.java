class Device {
    private String deviceId;
    private String status;
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public String getDeviceId() { return deviceId; }
    public String getStatus() { return status; }
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    private int temperatureSetting;
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T1", "ON", 24);
        t.displayStatus();
    }
}
