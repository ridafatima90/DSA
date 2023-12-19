package kunalkushwaha.bitwiseoperators;
//https://leetcode.com/problems/reverse-bits/?envType=study-plan-v2&envId=top-interview-150
public class ReverseBits {
    public static void main(String[] args) {
        int n = 0b0000010100101000001111010011100;
        System.out.println(reverseBits(n));
    }
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i< 32; i++){
            result = result<<1 | (n&1);
            n>>>=1;
        }
        return result;
    }
}