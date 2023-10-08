package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.*;

public class FamilyMember extends User implements Lights, Thermostats {

    public FamilyMember(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    // LIGHTS SETTINGS
    @Override
    public void dimLights(Room room) {
        manipulateDevice(room, lightsDevices, "Dimmed lights in ");
    }

    @Override
    public void turnOffLights(Room room) {
        manipulateDevice(room, lightsDevices, "Turned off lights in ");
    }

    @Override
    public void turnOnLights(Room room) {
        manipulateDevice(room, lightsDevices, "Turned on lights in ");
    }

    // TEMPERATURE SETTINGS
    @Override
    public void setTemperature(double celsius, Room room) {
        for (Device device : thermostatsDevices) {
            if (device.getRoom().getRoomName().equals(room.getRoomName())) {
                System.out.println("Temperature set at " + celsius + "°C");
            }
        }
    }
}
