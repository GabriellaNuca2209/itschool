package session11.challenges.smart_home_management_system;

public interface LightSys {

    String lightType = "LIGHT";

    void dimLights(Room room);
    void turnOffLights(Room room);
    void turnOnLights(Room room);


}
