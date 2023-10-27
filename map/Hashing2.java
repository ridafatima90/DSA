package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing2 {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("China", 150);
        hashMap.put("India", 120);
        hashMap.put("USA", 30);
        hashMap.put("UK", 80);
        hashMap.put("UK", 90);

        System.out.println(hashMap);

        String result = hashMap.containsKey("India")? "yes":  "no";
        System.out.println(result);

        Set<String> keys = hashMap.keySet();
        for(String key: keys) {
            System.out.println(key + " " + hashMap.get(key));
        }

        hashMap.remove("China");
        System.out.println(hashMap.getClass());
        System.out.println(hashMap);
    }
}
