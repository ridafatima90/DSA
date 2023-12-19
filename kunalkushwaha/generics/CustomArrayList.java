package kunalkushwaha.generics;
import java.util.*;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        //copy current items in new array
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public int getIndex(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();
        list.add(2);
        list.add(3);
        list.add(9);

        for(int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);

        CustomArrayList list2 = new CustomArrayList();
    }
}
