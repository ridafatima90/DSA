package kunalkushwaha.linearsearch;

public class SearchString {
    public static void main(String[] args) {
        String name = "mannawar";
        char c = 'r';
        System.out.println(search2(name, 'r'));
    }

    static boolean search2(String name, char c){
        if(name.length() == 0){
            return false;
        }
        for(char ch: name.toCharArray()){
            if(ch == c){
                return true;
            }
        }
        return false;
    }

    static boolean search(String name, char c){
        if(name.length() == 0){
            return false;
        }
        for(int i = 0 ; i< name.length(); i++){
            if(name.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
}
