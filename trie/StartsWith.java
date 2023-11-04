package trie;

public class StartsWith {
    static class Node {
        Node children[];
        boolean eow;
        public Node(){
            children = new Node[26];
            eow = false;
        }
    }
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(char c: word.toCharArray()){
            int idx = c - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(char c: key.toCharArray()){
            int idx = c - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean startsWith(String prefix){
        Node curr = root;
        for(char c: prefix.toCharArray()){
            int idx = c - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"apple", "app", "am", "man","woman"};
        String prefix = "";

        for(int i = 0; i< words.length; i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));
    }
}
