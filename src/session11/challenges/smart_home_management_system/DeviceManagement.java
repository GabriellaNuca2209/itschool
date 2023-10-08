package session11.challenges.smart_home_management_system;

import java.util.ArrayList;
import java.util.List;

public class DeviceManagement {

    public static double temperature;

    public static List<Light> lightsDevices = new ArrayList<>();
    public static List<Thermostat> thermostatsDevices = new ArrayList<>();
    public static List<Door> doorsDevices = new ArrayList<>();
    public static List<Window> windowsDevices = new ArrayList<>();
    public static List<Camera> camerasDevices = new ArrayList<>();
    public static List<Entertainment> entertainmentDevices = new ArrayList<>();

//    public static void openDevice(Room room, List<Device> deviceType, String message) {
//        for (Device device : deviceType) {
//            if (device.getRoom().getRoomName().equals(room.getRoomName())) {
//                if (!device.isOpen()) {
//                    device.setOpen(true);
//                    System.out.println(message + room.getRoomName());
//                } else {
//                    System.out.println("Already open");
//                }
//            }
//        }
//    }
//
//    public static void closeDevice(Room room, List<Device> deviceType, String message) {
//        for (Device device : deviceType) {
//            if (device.getRoom().getRoomName().equals(room.getRoomName())) {
//                if (device.isOpen()) {
//                    device.setOpen(false);
//                    System.out.println(message + room.getRoomName());
//                } else {
//                    System.out.println("Already closed");
//                }
//            }
//        }
//    }
}
