package kunalkushwaha.bitwiseoperators;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,4,4,5,6,5};
        System.out.println(unique(arr));
    }
    public static int unique(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
