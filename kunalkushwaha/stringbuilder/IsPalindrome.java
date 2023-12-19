package kunalkushwaha.stringbuilder;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "";
        System.out.println(isPlaindrome(s));
    }

    public static boolean isPlaindrome(String s){
        if(s.length() == 0 || s== null){
            return true;
        }
        String str = s.toLowerCase();
        for(int i = 0; i< str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() -1 -i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

}
