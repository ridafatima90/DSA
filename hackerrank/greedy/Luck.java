package hackerrank.greedy;
import java.util.*;

public class Luck {
    public static int luckBalance(int k, List<List<Integer>> contests){
        int luckBalance = 0;
        List<Integer> importantContest = new ArrayList<>();
        for(List<Integer>contest: contests) {
            int luck = contest.get(0);
            int importance = contest.get(1);

            if (importance == 1) {
                importantContest.add(luck);
            } else {
                luckBalance += luck;
            }
        }
        Collections.sort(importantContest);
        int numImportantContest = importantContest.size();
        System.out.println(importantContest);
        System.out.println(importantContest.size());
        for (int i = numImportantContest; i <= k; i--) {
            luckBalance += importantContest.get(i);
        }

        return luckBalance;
    }
    public static void main(String[] args) {
        int k = 3;
        List<List<Integer>> contests = new ArrayList<>();
                contests.add(List.of(8, 5));
                contests.add(List.of(13, 1));
                contests.add(List.of(10, 1));
                contests.add(List.of(9, 1));
                contests.add(List.of(8, 1));
                contests.add(List.of(13, 1));
                contests.add(List.of(12, 1));
                contests.add(List.of(18, 1));
                contests.add(List.of(13, 1));



        int result = luckBalance(k, contests);
        System.out.println("Luck balance: " + result);
    }
}
