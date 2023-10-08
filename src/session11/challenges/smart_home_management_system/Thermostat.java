package session11.challenges.smart_home_management_system;

public class Thermostat extends Device {

    private boolean isOn;
    private double temperature;

    public Thermostat(String deviceName, String deviceType, Room room, boolean isOn) {
        super(deviceName, deviceType, room);
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Thermostat{" +
                "isOn=" + isOn +
                ", temperature=" + temperature +
                '}';
    }
}
