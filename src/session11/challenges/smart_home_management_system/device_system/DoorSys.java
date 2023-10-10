package session11.challenges.smart_home_management_system.device_system;

import session11.challenges.smart_home_management_system.utility.Room;

public interface DoorSys {

    String doorType = "Door";

    void closeDoor(Room room);
    void openDoor(Room room);
    void lockDoor(Room room);
    void unlockDoor(Room room);
}
