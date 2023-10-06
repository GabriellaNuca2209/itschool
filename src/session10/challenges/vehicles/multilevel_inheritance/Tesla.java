package session10.challenges.vehicles.multilevel_inheritance;

public class Tesla extends ElectricCar {

    private double autopilotVersion;

    public Tesla(String make, String model, int year, int batteryCapacity, int range, double autopilotVersion) {
        super(make, model, year, batteryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Autopilot is enabled");
    }
    public void disableAutopilot() {
        System.out.println("Autopilot is disabled");
    }

    public double getAutopilotVersion() {
        return autopilotVersion;
    }

    public void setAutopilotVersion(double autopilotVersion) {
        this.autopilotVersion = autopilotVersion;
    }
}
