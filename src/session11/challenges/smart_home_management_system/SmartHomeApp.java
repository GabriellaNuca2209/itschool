package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.DeviceManagement.*;

public class SmartHomeApp {

    public static void main(String[] args) {
        LocalDate jonnyDate = LocalDate.of(1995, 8, 12);
        LocalDate susanDate = LocalDate.of(2010, 6, 23);

        // Rooms
        Room bedroom = new Room("Bedroom");
        Room livingroom = new Room("Living room");
        Room bathroom = new Room("Bathroom");
        Room kitchen = new Room("Kitchen");
        Room entrance = new Room("Entrance");

        // Users
        Admin jonny = new Admin("Jonny", "Test", jonnyDate);
        FamilyMember susan = new FamilyMember("Susan", "Malloy", susanDate);
        Guest juan = new Guest("Susan", "Malloy", susanDate);

        // Devices
        Device smartLight = new Device("Smart Light", "Light", bedroom);
        Device smarterLight = new Device("Smarter Light", "Light", livingroom);
        Device smartThermostat = new Device("Smart Thermostat", "Thermostat", livingroom);
        Device smartDoor = new Device("Smart Door", "Door", entrance);

        // Adding devices
        jonny.addDevice(smartLight);
        jonny.addDevice(smarterLight);
        jonny.addDevice(smartThermostat);
        jonny.addDevice(smartDoor);

        // Manipulating devices
        jonny.dimLights(bedroom);
        jonny.closeDoor(entrance);
        jonny.lockDoor(entrance);

        // Log devices
        System.out.println(lightsDevices);
        System.out.println(thermostatsDevices);
        System.out.println(doorsDevices);


    }
}
