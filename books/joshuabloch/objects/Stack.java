package books.joshuabloch.objects;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop(){
        if(size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity(){
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Stack s = new Stack();
        s.push(10);
        s.pop();

        long end = System.currentTimeMillis();

        System.out.println("Total time "+ (end-start));
    }
}
