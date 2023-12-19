package kunalkushwaha.generics;

import java.util.*;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< 5; i++){
            list.add(i);
        }
        Consumer<Integer> fun = (item) -> System.out.println(item *2);
        list.forEach(fun);
        Operation sum = (a, b) -> a+b;
        Operation sub = (a,b) -> a-b;
        Operation mul = (a,b) -> a*b;
        LambdaFunction calculate = new LambdaFunction();
        System.out.println(calculate.operate(2,3, mul));


    }




    private int operate(int a, int b, Operation op){
        return op.oper(a,b);
    }
}


interface Operation{
    int oper(int a, int b);
}
