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
                if (light.isOn()) {
                    light.setOn(false);
                    System.out.println("Lights off in " + room.getRoomName());
                } else {
                    System.out.println("Already off");
                }
            }
        }
    }

    @Override
    public void turnOnLights(Room room) {
        for (Light light : lightsDevices) {
            if (light.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (!light.isOn()) {
                    light.setOn(true);
                    System.out.println("Lights on in " + room.getRoomName());
                } else {
                    System.out.println("Already on");
                }
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
                if (door.isOpen()) {
                    door.setOpen(false);
                    System.out.println("Door closed in " + room.getRoomName());
                } else {
                    System.out.println("Already closed");
                }
            }
        }
    }

    @Override
    public void openDoor(Room room) {
        for (Door door : doorsDevices) {
            if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (!door.isOpen()) {
                    door.setOpen(true);
                    System.out.println("Door opened in " + room.getRoomName());
                } else {
                    System.out.println("Already opened");
                }
            }
        }
    }

    @Override
    public void lockDoor(Room room) {
        for (Door door : doorsDevices) {
            if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (!door.isOpen()) {
                    if (!door.isLocked()) {
                        door.setLocked(true);
                        System.out.println("Door locked at " + room.getRoomName());
                    } else {
                        System.out.println("Already locked");
                    }
                } else {
                    System.out.println("Cannot lock");
                }
            }
        }
    }

    @Override
    public void unlockDoor(Room room) {
        for (Door door : doorsDevices) {
            if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (!door.isOpen()) {
                    if (door.isLocked()) {
                        door.setLocked(false);
                        System.out.println("Door unlocked at " + room.getRoomName());
                    } else {
                        System.out.println("Already unlocked");
                    }
                } else {
                    System.out.println("Cannot unlock");
                }
            }
        }
    }

    // WINDOW SETTINGS
    @Override
    public void openWindow(Room room) {
        for (Window window : windowsDevices) {
            if (window.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (!window.isOpen()) {
                    window.setOpen(true);
                    System.out.println("Window opened in " + room.getRoomName());
                } else {
                    System.out.println("Already opened");
                }
            }
        }
    }

    @Override
    public void closeWindow(Room room) {
        for (Window window : windowsDevices) {
            if (window.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (window.isOpen()) {
                    window.setOpen(false);
                    System.out.println("Window closed in " + room.getRoomName());
                } else {
                    System.out.println("Already closed");
                }
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
