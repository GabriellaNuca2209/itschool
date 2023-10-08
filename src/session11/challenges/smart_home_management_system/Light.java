package session11.challenges.smart_home_management_system;

public class Light extends Device {

    private boolean isOn;

    public Light(String deviceName, String deviceType, Room room, boolean isOn) {
        super(deviceName, deviceType, room);
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return "Light{" +
                "isOn=" + isOn +
                '}';
    }
}
