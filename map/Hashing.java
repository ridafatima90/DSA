package map;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
//        set.add(null);
//        System.out.println(set);

        //search
        String s = set.contains(6) ? "Set contains 1" : "Doesnt";
        System.out.println(s);

        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("1 is removed by us");
        }

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()) {
            Integer value = it.next();
            it.remove();
            System.out.println(it.next());
        }

    }
}
