package lists;

import java.util.*;

public class LL2 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.addFirst("is");
        ll.add("a");
        System.out.println(ll);

        ll.addLast("list");
        ll.addFirst("this");
        System.out.println(ll);
        System.out.println(ll.size());

        for(int i = 0; i< ll.size(); i++) {
            System.out.print(ll.get(i) + " -> ");
        }
        System.out.println("null");

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);



    }
}
