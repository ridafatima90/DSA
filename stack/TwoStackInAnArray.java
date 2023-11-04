package stack;

public class TwoStackInAnArray {
    int[] arr;
    int size;
    int top1, top2;

    public TwoStackInAnArray(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    void push1(int x){
        if(top1 < top2 -1) {
            top1++;
            arr[top1] = x;
        }else {
            System.out.println("Stack overflow");
            System.exit(1);
        }
    }

    void push2(int x){
        if(top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }

    int pop1(){
        if(top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        }else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    int pop2(){
        if(top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        }else {
            System.out.println("Stack underflow");
            return -1;
        }
    }

    public static void main(String[] args) {
        TwoStackInAnArray ts = new TwoStackInAnArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

        System.out.println("Popped element from stack 1 "+ ts.pop1());
        System.out.println("Popped element from stack 2 "+ ts.pop2());

    }
}
