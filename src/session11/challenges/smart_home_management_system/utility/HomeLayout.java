package session11.challenges.smart_home_management_system.utility;

import java.util.ArrayList;
import java.util.List;

public class HomeLayout {

    public static Room bedroom = new Room("Bedroom");
    public static Room livingroom = new Room("Living Room");
    public static Room bathroom = new Room("Bathroom");
    public static Room kitchen = new Room("Kitchen");
    public static Room mainEntrance = new Room("Main Entrance");
    public static Room secondaryEntrance = new Room("Secondary Entrance");

    public static List<Room> roomList = new ArrayList<>(List.of(bedroom, livingroom, bathroom, kitchen, mainEntrance, secondaryEntrance));
}
