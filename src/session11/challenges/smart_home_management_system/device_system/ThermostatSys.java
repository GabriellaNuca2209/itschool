package session11.challenges.smart_home_management_system.device_system;

import session11.challenges.smart_home_management_system.utility.Room;

public interface ThermostatSys {

    String thermostatType = "Thermostat";

    void setTemperature(double celsius, Room room);
    void turnOnThermostat(Room room);
    void turnOffThermostat(Room room);
}
