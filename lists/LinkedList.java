package lists;

import java.io.IOException;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class deleteLinkedList {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        // Write your code here

        SinglyLinkedListNode head = llist;

        SinglyLinkedListNode current = head;
        if (position == 0) {
            head = head.next;
            return head;
        }
        SinglyLinkedListNode prev = null;

        for (int i = 0; current != null && i < position; i++) {
            prev = current;
            current = current.next;
        }

        prev.next = current.next;
        return head;

    }
}


class Solution {
    public static void main(String[] args) throws IOException {


        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(20);
        llist.insertNode(6);
        llist.insertNode(2);
        llist.insertNode(19);
        llist.insertNode(7);
        llist.insertNode(4);
        llist.insertNode(15);
        llist.insertNode(9);
        llist.insertNode(3);


        SinglyLinkedListNode llist1 = deleteLinkedList.deleteNode(llist.head, 7);
        printLinkedList(llist1);

    }

    public static void printLinkedList(SinglyLinkedListNode head){
        SinglyLinkedListNode current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}