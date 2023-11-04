package queue;

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListBasedImpl {
    private Node front;
    private Node rear;

    public LinkedListBasedImpl(){
        front = null;
        rear = null;
    }

    public void enqueue(int item){
        Node newNode = new Node(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue(int item){
        if(!isEmpty()) {
            int removedItem = front.data;
            front = front.next;
            if(front == null) {
                rear = null;
            }
            return removedItem;
        }else {
            System.out.println("queue empty");
            return -1;
        }
    }

    public boolean isEmpty(){
        return front == null;
    }
}
