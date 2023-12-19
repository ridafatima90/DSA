package leetcode.mock;

public class Q1 {
    public static int reverse(int x) {
        String strNum = Long.toString(Math.abs((long)x));

        boolean isNegative = x <0;
//        if(strNum.charAt(0) == '-'){
//            isNegative = true;
//            strNum = strNum.substring(1);
//        }
        String reverseString = new StringBuilder(strNum).reverse().toString();

        long reverseNum;
        try{
            reverseNum = Long.parseLong(reverseString);
        }catch(NumberFormatException e){
            return 0;
        }
        if(reverseNum > Integer.MAX_VALUE){
            return 0;
        }
        return isNegative ? (int) -reverseNum: (int) reverseNum;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
