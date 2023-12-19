package kunalkushwaha.bitwiseoperators;

public class FindOnlyUnique {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5};
        System.out.println(unique(arr));
    }
    public static int unique(int[] arr){
        int unique = 0;
        for(int n: arr){
            if(n%2 != 0){
                unique =n;
            }
        }
        return unique;
    }
}
