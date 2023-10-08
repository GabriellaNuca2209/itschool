package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.lightsDevices;
import static session11.challenges.smart_home_management_system.DeviceManagement.manipulateDevice;

public class Guest extends User implements Lights {

    public Guest(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    @Override
    public void dimLights(Room room) {
        if (room.getRoomName().equalsIgnoreCase("living room") || room.getRoomName().equalsIgnoreCase("kitchen")) {
            manipulateDevice(room, lightsDevices, "Dimmed lights in ");
        } else {
            System.out.println("Access denied");
        }
    }

    @Override
    public void turnOffLights(Room room) {

    }

    @Override
    public void turnOnLights(Room room) {

    }
}
