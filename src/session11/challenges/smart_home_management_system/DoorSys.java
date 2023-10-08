package session11.challenges.smart_home_management_system;

public interface DoorSys {

    String doorType = "Door";

    void closeDoor(Room room);
    void openDoor(Room room);
    void lockDoor(Room room);
    void unlockDoor(Room room);
}
