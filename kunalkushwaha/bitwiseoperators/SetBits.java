package kunalkushwaha.bitwiseoperators;

public class SetBits {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
        while(n > 0){

            n -= n & (-n);
            count++;
        }
        return count;
    }
}
