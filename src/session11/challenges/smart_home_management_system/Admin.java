package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.*;

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

    // CAMERA SETTINGS
    @Override
    public void startRecording(Room room) {
        for (Camera camera : camerasDevices) {
            if (camera.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (!camera.isRecording()) {
                    camera.setRecording(true);
                    System.out.println("Recording in process at " + room.getRoomName());
                } else {
                    System.out.println("Already recording");
                }
            }
        }
    }

    @Override
    public void stopRecording(Room room) {
        for (Camera camera : camerasDevices) {
            if (camera.getRoom().getRoomName().equalsIgnoreCase(room.getRoomName())) {
                if (camera.isRecording()) {
                    camera.setRecording(false);
                    System.out.println("Stopped recording at " + room.getRoomName());
                } else {
                    System.out.println("Camera is not recording");
                }
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
