package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

public class SmartHomeApp {

    public static void main(String[] args) {
        LocalDate jonnyDate = LocalDate.of(1995, 8, 12);
        LocalDate susanDate = LocalDate.of(2010, 6, 23);

        // Rooms
        Room bedroom = new Room("Bedroom");
        Room livingroom = new Room("Living room");
        Room bathroom = new Room("Bathroom");
        Room kitchen = new Room("Kitchen");

        // Users
        Admin jonny = new Admin("Jonny", "Test", jonnyDate);
        FamilyMember susan = new FamilyMember("Susan", "Malloy", susanDate);
        Guest juan = new Guest("Susan", "Malloy", susanDate);

        // Devices
        Device smartLight = new Device("Smart Light", "Light", bedroom);
        Device smarterLight = new Device("Smarter Light", "Light", livingroom);
        Device smartThermostat = new Device("Smart Thermostat", "Thermostat", livingroom);

        jonny.addDevice(smartLight);
        jonny.addDevice(smarterLight);
        jonny.getLightsDevices();
        jonny.dimLights(bedroom);
        jonny.addDevice(smartThermostat);
        jonny.getThermostatsDevices();
        jonny.removeDevice(smarterLight);
        jonny.getLightsDevices();

        System.out.println();
        System.out.println("Family member test");
        susan.dimLights(bedroom);

        System.out.println();
        System.out.println("Guest test");
        juan.dimLights(bedroom);
        juan.dimLights(livingroom);

    }
}
