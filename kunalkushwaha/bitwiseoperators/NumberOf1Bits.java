package kunalkushwaha.bitwiseoperators;

public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    public static void main(String[] args) {
        int n = 0b0000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i <= 32; i++){
            if(i == 1){
                count++;
            }
        }
        return count;
    }
}