package map.questions;

import java.util.*;

public class Itinerary {
    public static String printItinerary(HashMap<String, String> cityMap){
        HashMap<String, String> cityReverseMap = new HashMap<>();

//        for(String key: cityMap.keySet()) {
//            cityReverseMap.put(cityMap.get(key), key);
//        }

        for(HashMap.Entry<String, String> entry: cityMap.entrySet()) {
            cityReverseMap.put(entry.getValue(), entry.getKey());
        }

        for(String key: cityMap.keySet()) {
            if (!cityReverseMap.containsKey(key)) {
                return key;
            }
        }

        return null;

    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = printItinerary(tickets);

        while(tickets.containsKey(start)) {
            System.out.print(start + "-->");
            start = tickets.get(start);
        }
        System.out.print(start);
    }
}
