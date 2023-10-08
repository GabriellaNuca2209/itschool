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
        Room mainEntrance = new Room("Entrance");
        Room secondaryEntrance = new Room("Entrance");

        // Users
        Admin jonny = new Admin("Jonny", "Test", jonnyDate);
        FamilyMember susan = new FamilyMember("Susan", "Malloy", susanDate);
        Guest juan = new Guest("Susan", "Malloy", susanDate);

        // Devices
        Light bedroomLight = new Light("Smart20", "Light", bedroom, true);
        Thermostat bedroomThermostat = new Thermostat("Warm3000", "Thermostat", bedroom, true);
        Window livingRoomWindow = new Window("SeeThrough", "Window", livingroom, true);
        Door mainEntranceDoor = new Door("NoPassing", "Door", mainEntrance, true, false);
        Camera mainEntranceCamera = new Camera("ISeeYou", "Camera", mainEntrance, false);
        Entertainment livingRoomMainMusicSys = new Entertainment("Bass out", "Entertainment", livingroom, "music");

        // Adding devices
        jonny.addLight(bedroomLight);
        jonny.addThermostat(bedroomThermostat);
        jonny.addWindow(livingRoomWindow);
        jonny.addDoor(mainEntranceDoor);
        jonny.addCamera(mainEntranceCamera);
        jonny.addEntertainment(livingRoomMainMusicSys);

        // Manipulating devices
        jonny.snapshot(mainEntrance);

    }
}
