package session11.challenges.smart_home_management_system;

import session11.challenges.smart_home_management_system.devices.*;
import session11.challenges.smart_home_management_system.users.Admin;
import session11.challenges.smart_home_management_system.users.FamilyMember;
import session11.challenges.smart_home_management_system.users.Guest;

import java.time.LocalDate;

import static session11.challenges.smart_home_management_system.utility.HomeLayout.*;

public class SmartHomeApp {

    public static void main(String[] args) {
        LocalDate jonnyDate = LocalDate.of(1995, 8, 12);
        LocalDate susanDate = LocalDate.of(2010, 6, 23);

        // Users
        Admin jonny = new Admin("Jonny", "Test", jonnyDate);
        FamilyMember susan = new FamilyMember("Susan", "Malloy", susanDate);
        Guest juan = new Guest("Susan", "Malloy", susanDate);

        // Devices
        Light bedroomLight = new Light("Smart20", "Light", bedroom, true);
        Light kitchenLight = new Light("Smart20", "Light", kitchen, true);
        Light livingRoomLight = new Light("Smart20", "Light", livingroom, true);

        Thermostat bedroomThermostat = new Thermostat("Warm3000", "Thermostat", bedroom, true);
        Thermostat livingRoomThermostat = new Thermostat("Warm3000", "Thermostat", livingroom, true);
        Thermostat kitchenThermostat = new Thermostat("Warm3000", "Thermostat", kitchen, true);
        Thermostat bathroomThermostat = new Thermostat("Warm3000", "Thermostat", bathroom, true);

        Window livingRoomWindow = new Window("SeeThrough", "Window", livingroom, true);
        Window kitchenWindow = new Window("SeeThrough", "Window", kitchen, true);

        Door mainEntranceDoor = new Door("NoPassing", "Door", mainEntrance, true, false);
        Door secondaryEntranceDoor = new Door("NoPassing", "Door", secondaryEntrance, true, false);

        Camera mainEntranceCamera = new Camera("ISeeYou", "Camera", mainEntrance, false);
        Camera secondaryEntranceCamera = new Camera("ISeeYou", "Camera", secondaryEntrance, false);

        Entertainment livingRoomMainMusicSys = new Entertainment("Bass out", "Entertainment", livingroom, "music");

        // Adding devices
        jonny.addLight(bedroomLight);
        jonny.addLight(kitchenLight);
        jonny.addLight(livingRoomLight);

        jonny.addThermostat(bedroomThermostat);
        jonny.addThermostat(livingRoomThermostat);
        jonny.addThermostat(kitchenThermostat);
        jonny.addThermostat(bathroomThermostat);

        jonny.addWindow(livingRoomWindow);
        jonny.addWindow(kitchenWindow);

        jonny.addDoor(mainEntranceDoor);
        jonny.addDoor(secondaryEntranceDoor);

        jonny.addCamera(mainEntranceCamera);
        jonny.addCamera(secondaryEntranceCamera);

        jonny.addEntertainment(livingRoomMainMusicSys);

        // Manipulating devices
        jonny.turnOnLights(bedroom);
        jonny.closeDoor(mainEntrance);
        susan.closeDoor(mainEntrance);

    }
}
