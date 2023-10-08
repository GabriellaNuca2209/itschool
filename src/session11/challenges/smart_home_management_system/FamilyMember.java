package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.*;
import static session11.challenges.smart_home_management_system.DeviceManagement.entertainmentDevices;

public class FamilyMember extends User implements LightSys, ThermostatSys, DoorSys, WindowSys, EntertainmentSys {

    public FamilyMember(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    // LIGHTS SETTINGS
    @Override
    public void dimLights(Room room) {
        for (Device device : lightsDevices) {
            if (device.getRoom().getRoomName().equals(room.getRoomName())) {
                System.out.println("Dimmed lights in " + room.getRoomName());
            }
        }
    }

    @Override
    public void turnOffLights(Room room) {
        for (Light light : lightsDevices) {
            if (light.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkLightOn(light, room);
            }
        }
    }

    @Override
    public void turnOnLights(Room room) {
        for (Light light : lightsDevices) {
            if (light.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkLightOff(light, room);
            }
        }
    }

    // TEMPERATURE SETTINGS
    @Override
    public void setTemperature(double celsius, Thermostat thermostat) {
        thermostat.setTemperature(celsius);
        System.out.println("Temperature set at " + celsius + "°C");
    }

    // DOOR SETTINGS
    @Override
    public void closeDoor(Room room) {
        for (Door door : doorsDevices) {
            if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkOpenDoor(door, room);
            }
        }
    }

    @Override
    public void openDoor(Room room) {
        for (Door door : doorsDevices) {
            if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkCloseDoor(door, room);
            }
        }
    }

    @Override
    public void lockDoor(Room room) {
        for (Door door : doorsDevices) {
            if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkUnlockedDoor(door, room);
            }
        }
    }

    @Override
    public void unlockDoor(Room room) {
        for (Door door : doorsDevices) {
            if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkLockedDoor(door, room);
            }
        }
    }

    // WINDOW SETTINGS
    @Override
    public void openWindow(Room room) {
        for (Window window : windowsDevices) {
            if (window.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkClosedWindow(window, room);
            }
        }
    }

    @Override
    public void closeWindow(Room room) {
        for (Window window : windowsDevices) {
            if (window.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkOpenWindow(window, room);
            }
        }
    }

    // ENTERTAINMENT SETTINGS
    @Override
    public void playMusic(Room room) {
        for (Entertainment entertainment : entertainmentDevices) {
            if (entertainment.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                System.out.println("Playing music");
            }
        }
    }

    @Override
    public void stopMusic(Room room) {
        for (Entertainment entertainment : entertainmentDevices) {
            if (entertainment.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                System.out.println("Stopped playing music");
            }
        }
    }
}
