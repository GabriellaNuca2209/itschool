package session11.challenges.smart_home_management_system.devices;

import session11.challenges.smart_home_management_system.utility.Room;

public class Door extends Device {

    private boolean isOpen;
    private boolean isLocked;

    public Door(String deviceName, String deviceType, Room room, boolean isOpen, boolean isLocked) {
        super(deviceName, deviceType, room);
        this.isOpen = isOpen;
        this.isLocked = isLocked;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    @Override
    public String toString() {
        return "Door{" +
                "isOpen=" + isOpen +
                ", isLocked=" + isLocked +
                '}';
    }
}
