package session11.challenges.smart_home_management_system;

import java.util.ArrayList;
import java.util.List;

public class DeviceManagement {

    public static List<Light> lightsDevices = new ArrayList<>();
    public static List<Thermostat> thermostatsDevices = new ArrayList<>();
    public static List<Door> doorsDevices = new ArrayList<>();
    public static List<Window> windowsDevices = new ArrayList<>();
    public static List<Camera> camerasDevices = new ArrayList<>();
    public static List<Entertainment> entertainmentDevices = new ArrayList<>();

    public static void checkLightOn(Light light, Room room) {
        if (light.isOn()) {
            light.setOn(false);
            System.out.println("Lights off in " + room.getRoomName());
        } else {
            System.out.println("Already off");
        }
    }

    public static void checkLightOff(Light light, Room room) {
        if (!light.isOn()) {
            light.setOn(true);
            System.out.println("Lights on in " + room.getRoomName());
        } else {
            System.out.println("Already on");
        }
    }

    public static void checkThermostatOn(Thermostat thermostat, Room room) {
        if (thermostat.isOn()) {
            thermostat.setOn(false);
            System.out.println("Thermostat off in " + room.getRoomName());
        } else {
            System.out.println("Already off");
        }
    }

    public static void checkThermostatOff(Thermostat thermostat, Room room) {
        if (!thermostat.isOn()) {
            thermostat.setOn(true);
            System.out.println("Thermostat on in " + room.getRoomName());
        } else {
            System.out.println("Already on");
        }
    }

    public static void checkOpenDoor(Door door, Room room) {
        if (door.isOpen()) {
            door.setOpen(false);
            System.out.println("Door closed in " + room.getRoomName());
        } else {
            System.out.println("Already closed");
        }
    }

    public static void checkCloseDoor(Door door, Room room) {
        if (!door.isOpen()) {
            door.setOpen(true);
            System.out.println("Door opened in " + room.getRoomName());
        } else {
            System.out.println("Already opened");
        }
    }

    public static void checkUnlockedDoor(Door door, Room room) {
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

    public static void checkLockedDoor(Door door, Room room) {
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

    public static void checkClosedWindow(Window window, Room room) {
        if (!window.isOpen()) {
            window.setOpen(true);
            System.out.println("Window opened in " + room.getRoomName());
        } else {
            System.out.println("Already opened");
        }
    }

    public static void checkOpenWindow(Window window, Room room) {
        if (window.isOpen()) {
            window.setOpen(false);
            System.out.println("Window closed in " + room.getRoomName());
        } else {
            System.out.println("Already closed");
        }
    }

    public static void checkNotRecording(Camera camera, Room room) {
        if (!camera.isRecording()) {
            camera.setRecording(true);
            System.out.println("Recording in process at " + room.getRoomName());
        } else {
            System.out.println("Already recording");
        }
    }

    public static void checkRecording(Camera camera, Room room) {
        if (camera.isRecording()) {
            camera.setRecording(false);
            System.out.println("Stopped recording at " + room.getRoomName());
        } else {
            System.out.println("Camera is not recording");
        }
    }

}
