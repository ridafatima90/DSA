package lists;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.stream.Stream;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class Practise {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //create a dummy node to serve as a head of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        //Merge the two sorted list
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            }else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        //if one of the list is not fully processed
        if(l1 != null) {
            current.next = l1;
        }else {
            current.next = l2;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

    }
}
