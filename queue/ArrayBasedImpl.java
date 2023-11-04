package queue;

public class ArrayBasedImpl {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public ArrayBasedImpl(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int item){
        if(currentSize < maxSize) {
            rear = (rear+1)%maxSize;
            queueArray[rear] = item;
            currentSize++;
        }else {
            System.out.println("Queue full");
        }
    }

    public int dequeue(int item){
        if(!isEmpty()) {
            int removedItem = queueArray[front];
            front = (front+1)%maxSize;
            queueArray[front]= item;
            currentSize--;
            return removedItem;
        }else {
            System.out.println("queue empty");
            return -1;
        }
    }

    public boolean isEmpty(){
        return currentSize ==0;
    }

    public boolean isFull(){
        return currentSize == maxSize;
    }
}
