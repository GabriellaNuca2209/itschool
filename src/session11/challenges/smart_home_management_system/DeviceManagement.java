package session11.challenges.smart_home_management_system;

import java.util.ArrayList;
import java.util.List;

public class DeviceManagement {

    public static List<Device> lightsDevices = new ArrayList<>();
    public static List<Device> thermostatsDevices = new ArrayList<>();
    public static List<Device> doorsDevices = new ArrayList<>();
    public static List<Device> windowsDevices = new ArrayList<>();
    public static List<Device> camerasDevices = new ArrayList<>();
    public static List<Device> entertainmentDevices = new ArrayList<>();

    public static void manipulateDevice(Room room, List<Device> deviceType, String message) {
        for (Device device : deviceType) {
            if (device.getRoom().getRoomName().equals(room.getRoomName())) {
                System.out.println(message + room.getRoomName());
            }
        }
    }
}
