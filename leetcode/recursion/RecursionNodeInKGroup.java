package leetcode.recursion;
//https://leetcode.com/problems/reverse-nodes-in-k-group/

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RecursionNodeInKGroup {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        System.out.println(reverseKGroup(head, k));
    }
    public static ListNode reverseKGroup(ListNode head, int k) {

        if(countNode(head) < k){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        //Reverse the list
        int count = 0;
        while(count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        //reverse the remaining ListNode
        if(next != null){
            head.next = reverseKGroup(next, k);
        }
        return prev;
    }

    public static int countNode(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}