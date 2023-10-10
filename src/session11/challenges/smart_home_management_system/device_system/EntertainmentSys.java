package session11.challenges.smart_home_management_system.device_system;

import session11.challenges.smart_home_management_system.utility.Room;

public interface EntertainmentSys {

    String entertainmentType = "Entertainment";

    void playMusic(Room room);
    void stopMusic(Room room);
}
