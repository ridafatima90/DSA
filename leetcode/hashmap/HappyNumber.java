package leetcode.hashmap;
import java.util.*;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }while( slow != fast);

        return slow == 1;
    }

    private static int getNext(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
