package map.questions;

import java.util.*;

public class FreqQuery {
    static List<Integer> freqQuery(List<List<Integer>> queries){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(List<Integer> query: queries) {
            int operation = query.get(0);
            int value = query.get(1);

            switch (operation) {
                case 1:
                    //insert
                    freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
                    break;
                case 2:
                    //delete
                    if (freqMap.containsKey(value)) {
                        freqMap.put(value, freqMap.get(value) - 1);
                        if (freqMap.get(value) == 0) {
                            freqMap.remove(value);
                        }
                    }
                    break;
                case 3:
                    //check frequency
                    int frequency = query.get(1);
                    result.add(freqMap.containsValue(frequency) ? 1 : 0);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation");

            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> queries = List.of(List.of(1,1), List.of(1,2), List.of(3,2));

        System.out.println(freqQuery(queries));

    }
}
