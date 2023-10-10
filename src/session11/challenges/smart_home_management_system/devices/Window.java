package session11.challenges.smart_home_management_system.devices;

import session11.challenges.smart_home_management_system.utility.Room;

public class Window extends Device {

    private boolean isOpen;

    public Window(String deviceName, String deviceType, Room room, boolean isOpen) {
        super(deviceName, deviceType, room);
        this.isOpen = isOpen;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Window{" +
                "isOpen=" + isOpen +
                '}';
    }
}
