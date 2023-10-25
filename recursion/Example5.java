package recursion;

import java.util.ArrayList;

public class Example5 {
    public static void findSubSets(int n, ArrayList<Integer> subSet){

        if(n == 0) {
            printSubSet(subSet);
            return;
        }
        //when add
        subSet.add(n);
        findSubSets(n-1, subSet);

        //when not add
        subSet.remove(subSet.size() -1);
        findSubSets(n-1, subSet);
    }

    private static void printSubSet(ArrayList<Integer> subSet) {

        for(int i = 0; i< subSet.size(); i++) {
            System.out.print(subSet.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubSets(n, subSet);
    }
}
