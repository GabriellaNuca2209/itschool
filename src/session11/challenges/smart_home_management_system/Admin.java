package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.*;

public class Admin extends User implements Lights, Thermostats, Doors {

    public Admin(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    public void addDevice(Device device) {
        if (device.getDeviceType().equalsIgnoreCase(lightType)) {
            lightsDevices.add(device);
        } else if (device.getDeviceType().equalsIgnoreCase(thermostatType)) {
            thermostatsDevices.add(device);
        } else if (device.getDeviceType().equalsIgnoreCase(doorType)) {
            doorsDevices.add(device);
        }
    }

    public void removeDevice(Device device) {
        if (device.getDeviceType().equalsIgnoreCase(lightType)) {
            lightsDevices.remove(device);
        } else if (device.getDeviceType().equalsIgnoreCase(thermostatType)) {
            thermostatsDevices.remove(device);
        } else if (device.getDeviceType().equalsIgnoreCase(doorType)) {
            doorsDevices.remove(device);
        }
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

    // DOOR SETTINGS
    @Override
    public void closeDoor(Room room) {
        manipulateDevice(room, doorsDevices, "Door closed in ");
    }

    @Override
    public void openDoor(Room room) {
        manipulateDevice(room, doorsDevices, "Door opened in ");
    }

    @Override
    public void lockDoor(Room room) {
        manipulateDevice(room, doorsDevices, "Locked door in ");
    }

    @Override
    public void unlockDoor(Room room) {
        manipulateDevice(room, doorsDevices, "Unlocked door in ");
    }

}
