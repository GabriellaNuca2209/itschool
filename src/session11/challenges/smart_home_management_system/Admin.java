package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.*;
import static session11.challenges.smart_home_management_system.HomeLayout.roomList;

public class Admin extends User implements LightSys, ThermostatSys, DoorSys, WindowSys, CameraSys, EntertainmentSys {

    public Admin(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    public void addLight(Light light) {
        lightsDevices.add(light);
    }

    public void addThermostat(Thermostat thermostat) {
        thermostatsDevices.add(thermostat);
    }

    public void addDoor(Door door) {
        doorsDevices.add(door);
    }

    public void addWindow(Window window) {
        windowsDevices.add(window);
    }

    public void addCamera(Camera camera) {
        camerasDevices.add(camera);
    }

    public void addEntertainment(Entertainment entertainment) {
        entertainmentDevices.add(entertainment);
    }

    public void setNightMode() {
        for (Room room : roomList) {
            dimLights(room);
            turnOnThermostat(room);
            setTemperature(23, room);
            closeWindow(room);
            closeDoor(room);
            lockDoor(room);
        }
    }

    // LIGHTS SETTINGS
    @Override
    public void dimLights(Room room) {
        for (Light light : lightsDevices) {
            if (light.getRoom().getRoomName().equals(room.getRoomName())) {
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
    public void setTemperature(double celsius, Room room) {
        for (Thermostat thermostat : thermostatsDevices) {
            if (thermostat.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName()) && thermostat.isOn()) {
                thermostat.setTemperature(celsius);
                System.out.println("Temperature set at " + celsius + "°C in " + room.getRoomName());
            }
        }
    }

    @Override
    public void turnOnThermostat(Room room) {
        for (Thermostat thermostat : thermostatsDevices) {
            if (thermostat.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkThermostatOff(thermostat, room);
            }
        }
    }

    @Override
    public void turnOffThermostat(Room room) {
        for (Thermostat thermostat : thermostatsDevices) {
            if (thermostat.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkThermostatOn(thermostat, room);
            }
        }
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

    // CAMERA SETTINGS
    @Override
    public void startRecording(Room room) {
        for (Camera camera : camerasDevices) {
            if (camera.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkNotRecording(camera, room);
            }
        }
    }

    @Override
    public void stopRecording(Room room) {
        for (Camera camera : camerasDevices) {
            if (camera.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                checkRecording(camera, room);
            }
        }
    }

    @Override
    public void snapshot(Room room) {
        for (Camera camera : camerasDevices) {
            if (camera.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                System.out.println("Camera took a picture, pose!");
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
