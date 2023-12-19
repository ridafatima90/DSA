package kunalkushwaha.recursion;
//https://leetcode.com/problems/add-two-numbers/

//Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1, l2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while(l1 != null || l2 != null){
            int x = (l1 != null)? l1.val : 0;
            int y = (l2 != null)? l2.val : 0;

            int sum = x +y + carry;

            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}