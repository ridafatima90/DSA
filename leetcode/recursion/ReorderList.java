package leetcode.recursion;
//https://leetcode.com/problems/reorder-list/
class ListNode2 {
      int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
 }


public class ReorderList {
    public static void main(String[] args) {
        ListNode2 list1 = new ListNode2(1, new ListNode2(2, new ListNode2(3, new ListNode2(4, new ListNode2(5)))));
        printList(list1);
        reorderList(list1);
        printList(list1);
    }


    public static void reorderList(ListNode2 head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode2 slow = head;
        ListNode2 fast = head;

        //Find middle after while loop, slow == middle, fast == end
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //2.Reverse the second half of the list
        ListNode2 reversedSecondHalf = reverseList(slow.next);
        slow.next = null;

        //3.Merge the second list with first half
        mergeLists(head, reversedSecondHalf);
    }

    private static ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;
        ListNode2 current = head;
        while(current != null){
            ListNode2 nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    private static void mergeLists(ListNode2 first, ListNode2 second) {
        while(second != null){
            ListNode2 temp1 = first.next;
            ListNode2 temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    private static void printList(ListNode2 head){
        ListNode2 current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}