package session11.challenges.smart_home_management_system.device_system;

import session11.challenges.smart_home_management_system.utility.Room;

public interface WindowSys {

    String windowType = "Window";

    void openWindow(Room room);
    void closeWindow(Room room);
}
