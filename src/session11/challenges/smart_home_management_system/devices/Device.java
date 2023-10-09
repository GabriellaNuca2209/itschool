package session11.challenges.smart_home_management_system.devices;

import session11.challenges.smart_home_management_system.utility.Room;

public class Device {

    private String deviceName;
    private String deviceType;
    private Room room;

    public Device(String deviceName, String deviceType, Room room) {
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.room = room;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", room=" + room +
                '}';
    }
}
