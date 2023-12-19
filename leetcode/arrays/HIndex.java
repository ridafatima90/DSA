package leetcode.arrays;
//https://leetcode.com/problems/h-index/?envType=study-plan-v2&envId=top-interview-150
import java.lang.reflect.Array;
import java.util.Arrays;

class HIndex {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        int n = citations.length;

//        Arrays.sort(citations);
//        System.out.println(Arrays.toString(citations));
//        for(int i = 0; i< citations.length; i++) {
//            int h = n- i;
//            if(citations[i] >= h){
//                return h;
//            }
//
//        }
//        return 0;

        int[] count = new int[n+1];
        for(int citation : citations){
            count[(Math.min(citation, n))]++;
        }

        int hIndex = 0;
        int totalPapers = 0;
        for(int i = n; i >=0; i--){
            totalPapers += count[i];

            if(totalPapers >= i){
                hIndex = i;
                break;
            }
        }
        return hIndex;
    }
}