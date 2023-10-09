package session11.challenges.smart_home_management_system.device_system;

import session11.challenges.smart_home_management_system.utility.Room;

public interface LightSys {

    String lightType = "LIGHT";

    void dimLights(Room room);
    void turnOffLights(Room room);
    void turnOnLights(Room room);


}
