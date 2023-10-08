package session11.challenges.smart_home_management_system;

import java.time.LocalDate;

public class SmartHomeApp {

    public static void main(String[] args) {
        LocalDate jonnyDate = LocalDate.of(1995, 8, 12);
        LocalDate susanDate = LocalDate.of(2010, 6, 23);

        // Rooms
        Room bedroom = new Room("Bedroom");
        Room livingroom = new Room("Living Room");
        Room bathroom = new Room("Bathroom");
        Room kitchen = new Room("Kitchen");
        Room entrance = new Room("Entrance");

        // Users
        Admin jonny = new Admin("Jonny", "Test", jonnyDate);
        FamilyMember susan = new FamilyMember("Susan", "Malloy", susanDate);
        Guest juan = new Guest("Susan", "Malloy", susanDate);

        // Devices
        Light bedroomLight = new Light("Smart20", "Light", bedroom, true);
        Thermostat bedroomThermostat = new Thermostat("Warm3000", "Thermostat", bedroom, true);
        Window livingRoomWindow = new Window("SeeThrough", "Window", livingroom, true);
        Door entranceDoor = new Door("NoPassing", "Door", entrance, true, false);
        Camera entranceCamera = new Camera("ISeeYou", "Camera", entrance, false);

        // Adding devices
        jonny.addLight(bedroomLight);
        jonny.addThermostat(bedroomThermostat);
        jonny.addWindow(livingRoomWindow);
        jonny.addDoor(entranceDoor);
        jonny.addCamera(entranceCamera);

        // Manipulating devices
        jonny.snapshot(entrance);

    }
}
