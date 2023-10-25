package recursion;

public class MoveAllxIteratively {
    public static String moveX(String str1){
        int count = 0;
        String newStr = "";
        for (int i = 0; i< str1.length() -1; i++) {
            if (str1.charAt(i) == 'x') {
                count++;
            } else {
                newStr += str1.charAt(i);
            }
        }
        for(int i = 0; i<= count; i++) {
            newStr += 'x';
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(moveX("abxcxxxdefxx"));
    }
}
