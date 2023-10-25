package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueen  {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        try{if(s1>0 && s2 > 0) {
            System.out.println(s1 * s2);
        }else {
            throw new Exception("Breadth and height must be positive");
        }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
