package recursion;

public class MoveXRecursively {
    public static void moveX(String str, int idx, int count, String newStr){
        if(idx == str.length()) {
            for(int i= 0 ; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
            moveX(str, idx+1, count, newStr);
        }else {
            newStr += currChar;
            moveX(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        moveX("abxcxxxdefxx", 0, 0, "");
    }
}
