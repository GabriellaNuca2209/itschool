package session14_collections.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> myMap = initializeMap();
        System.out.println(myMap);

        int retrievedVal = retrieveValue(myMap, "two");
        System.out.println("Retrieved val: " + retrievedVal);

        updateMap(myMap, "three", 10);
        System.out.println("Updated val: " + retrieveValue(myMap, "three"));
    }

    private static Map<String, Integer> initializeMap() {
        Map<String, Integer> myAwesomeMap = new HashMap<>();
        myAwesomeMap.put("one", 1);
        myAwesomeMap.put("two", 2);
        myAwesomeMap.put("three", 3);

        return myAwesomeMap;
    }

    private static int retrieveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    private static void updateMap(Map<String, Integer> map, String key, int val) {
        map.put(key, val);
    }
}
