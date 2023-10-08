package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.*;

public class Guest extends User implements LightSys, ThermostatSys, DoorSys, EntertainmentSys {

    public Guest(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }


    @Override
    public void closeDoor(Room room) {
        for (Door door : doorsDevices) {
            if (room.getRoomName().equalsIgnoreCase("bathroom")) {
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
    }

    @Override
    public void openDoor(Room room) {
        for (Door door : doorsDevices) {
            if (room.getRoomName().equalsIgnoreCase("bathroom")) {
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
    }

    @Override
    public void lockDoor(Room room) {
        for (Door door : doorsDevices) {
            if (room.getRoomName().equalsIgnoreCase("bathroom")) {
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
            } else {
                System.out.println("Access denied");
            }
        }
    }

    @Override
    public void unlockDoor(Room room) {
        for (Door door : doorsDevices) {
            if (room.getRoomName().equalsIgnoreCase("bathroom")) {
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
            } else {
                System.out.println("Access denied");
            }
        }
    }

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

    @Override
    public void dimLights(Room room) {
        if (room.getRoomName().equalsIgnoreCase("living room")) {
            for (Device device : lightsDevices) {
                if (device.getRoom().getRoomName().equals(room.getRoomName())) {
                    System.out.println("Dimmed lights in " + room.getRoomName());
                }
            }
        } else {
            System.out.println("Access denied");
        }
    }

    @Override
    public void turnOffLights(Room room) {
        for (Light light : lightsDevices) {
            if (room.getRoomName().equalsIgnoreCase("living room")) {
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
    }

    @Override
    public void turnOnLights(Room room) {
        for (Light light : lightsDevices) {
            if (room.getRoomName().equalsIgnoreCase("living room")) {
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
    }

    @Override
    public void setTemperature(double celsius, Thermostat thermostat) {
        thermostat.setTemperature(celsius);
        System.out.println("Temperature set at " + celsius + "°C");
    }
}
