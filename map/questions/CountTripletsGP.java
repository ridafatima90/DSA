package map.questions;

import java.util.*;

public class CountTripletsGP {

    public static long countTriplets(List<Integer> arr, Integer r){
        long count = 0;
        Map<Long, Long> secondMap = new HashMap<>();
        Map<Long, Long> thirdMap = new HashMap<>();

        for(long num: arr) {
            if(num % r == 0) {

                count += thirdMap.getOrDefault(num/r, 0L);

                thirdMap.put(num,thirdMap.getOrDefault(num, 0L) + secondMap.getOrDefault(num/r, 0L));
            }

            secondMap.put(num, secondMap.getOrDefault(num, 0L)+1);
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countTriplets(Arrays.asList(1, 2, 2, 4), 2));
    }
}
