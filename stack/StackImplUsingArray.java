package stack;

public class StackImplUsingArray {

    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{

    }

    public static void main(String[] args) {
        StackImplUsingLinkedList.Stack s = new StackImplUsingLinkedList.Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
