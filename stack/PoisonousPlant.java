package stack;

import java.util.*;

public class PoisonousPlant {
    public static int poisonousPlant(List<Integer> p){
        int days = 0;

        Stack<Integer> stack = new Stack<>();

        stack.push(0);


        int[] daysToDie = new int[p.size()];
        Arrays.fill(daysToDie, 0);
        daysToDie[0] = 1;

        for(int i = 1; i < p.size(); i++){
            while(!stack.isEmpty() && p.get(i) <= stack.peek()){
                if(!stack.isEmpty()) {
                daysToDie[stack.peek()] = daysToDie[i] + 1;
                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                daysToDie[i]=0;
            }else {
                daysToDie[i] = daysToDie[stack.peek()] + 1;
            }
            days = Math.max(days, daysToDie[i]);

            stack.push(i);
        }

        return days;
    }

    public static void main(String[] args) {
        List<Integer> plants = Arrays.asList(3, 2, 5, 4);
        System.out.println(poisonousPlant(plants));

    }
}
