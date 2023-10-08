package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.lightsDevices;
import static session11.challenges.smart_home_management_system.DeviceManagement.thermostatsDevices;

public class Admin extends User implements Lights, Thermostats {

    public Admin(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
    }

    public void addDevice(Device device) {
        if (device.getDeviceType().equalsIgnoreCase(lightType)) {
            lightsDevices.add(device);
        } else if (device.getDeviceType().equalsIgnoreCase(thermostatType)) {
            thermostatsDevices.add(device);
        }
    }

    public void removeDevice(Device device) {
        if (device.getDeviceType().equalsIgnoreCase(lightType)) {
            lightsDevices.remove(device);
        } else if (device.getDeviceType().equalsIgnoreCase(thermostatType)) {
            thermostatsDevices.remove(device);
        }
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
        for (Device device : lightsDevices) {
            if (device.getRoom().getRoomName().equals(room.getRoomName())) {
                System.out.println("Lights off in " + room.getRoomName());
            }
        }
    }

    @Override
    public void turnOnLights(Room room) {
        for (Device device : lightsDevices) {
            if (device.getRoom().getRoomName().equals(room.getRoomName())) {
                System.out.println("Lights on in " + room.getRoomName());
            }
        }
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

    public void getLightsDevices() {
        System.out.println(lightsDevices);
    }

    public void getThermostatsDevices() {
        System.out.println(thermostatsDevices);
    }
}
