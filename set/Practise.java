package set;

import java.util.*;

public class Practise {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();

        set.add("walter");
        set.add("Todd");
        set.add("James");


        list.add("Pam");
        list.add("Tom");
        list.add("sam");


        System.out.println(set);
//        System.out.println("---------------------");
//        System.out.println(list);

    }
}
