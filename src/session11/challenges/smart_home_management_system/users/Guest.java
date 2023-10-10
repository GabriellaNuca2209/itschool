package session11.challenges.smart_home_management_system.users;

import session11.challenges.smart_home_management_system.device_system.DoorSys;
import session11.challenges.smart_home_management_system.device_system.EntertainmentSys;
import session11.challenges.smart_home_management_system.device_system.LightSys;
import session11.challenges.smart_home_management_system.device_system.ThermostatSys;
import session11.challenges.smart_home_management_system.devices.Door;
import session11.challenges.smart_home_management_system.devices.Entertainment;
import session11.challenges.smart_home_management_system.devices.Light;
import session11.challenges.smart_home_management_system.devices.Thermostat;
import session11.challenges.smart_home_management_system.utility.Room;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.utility.DeviceManagement.*;

public class Guest extends User implements LightSys, ThermostatSys, DoorSys, EntertainmentSys {

    public Guest(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    @Override
    public void closeDoor(Room room) {
        for (Door door : doorsDevices) {
            if (room.getRoomName().equalsIgnoreCase("bathroom")) {
                if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                    checkOpenDoor(door, room);
                }
            }
        }
    }

    @Override
    public void openDoor(Room room) {
        for (Door door : doorsDevices) {
            if (room.getRoomName().equalsIgnoreCase("bathroom")) {
                if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                    checkCloseDoor(door, room);
                }
            }
        }
    }

    @Override
    public void lockDoor(Room room) {
        for (Door door : doorsDevices) {
            if (room.getRoomName().equalsIgnoreCase("bathroom")) {
                if (door.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                    checkUnlockedDoor(door, room);
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
                    checkLockedDoor(door, room);
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
            for (Light light : lightsDevices) {
                if (light.getRoom().getRoomName().equals(room.getRoomName())) {
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
                    checkLightOn(light, room);
                }
            } else {
                System.out.println("Access denied");
            }
        }
    }

    @Override
    public void turnOnLights(Room room) {
        for (Light light : lightsDevices) {
            if (room.getRoomName().equalsIgnoreCase("living room")) {
                if (light.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                    checkLightOff(light, room);
                }
            } else {
                System.out.println("Access denied");
            }
        }
    }

    @Override
    public void setTemperature(double celsius, Room room) {
        for (Thermostat thermostat : thermostatsDevices) {
            if (thermostat.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                thermostat.setTemperature(celsius);
                System.out.println("Temperature set at " + celsius + "°C");
            }
        }
    }

    @Override
    public void turnOnThermostat(Room room) {
        for (Thermostat thermostat : thermostatsDevices) {
            if (!room.getRoomName().equalsIgnoreCase("bedroom")) {
                if (thermostat.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                    checkThermostatOff(thermostat, room);
                }
            } else {
                System.out.println("Access denied");
            }
        }
    }

    @Override
    public void turnOffThermostat(Room room) {
        for (Thermostat thermostat : thermostatsDevices) {
            if (!room.getRoomName().equalsIgnoreCase("bedroom")) {
                if (thermostat.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                    checkThermostatOn(thermostat, room);
                }
            } else {
                System.out.println("Access denied");
            }
        }
    }
}
