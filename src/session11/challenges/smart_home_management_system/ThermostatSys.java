package session11.challenges.smart_home_management_system;

public interface ThermostatSys {

    String thermostatType = "Thermostat";

    void setTemperature(double celsius, Room room);
    void turnOnThermostat(Room room);
    void turnOffThermostat(Room room);
}
