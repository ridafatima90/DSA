package trie;

public class WordBreak {
    //all possible substrings/pieces
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
        for(int i = 0; i< word.length();i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length() -1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
       Node curr = root;
       for(char c: key.toCharArray()){
           int idx = c - 'a';
           Node node = curr.children[idx];
           if(node == null){
               return false;
           }
           curr = node;
       }
       return curr != null && curr.eow;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 0; i < key.length(); i++){
            String firstPart = key.substring(0,i+1);
            String secondPart = key.substring(i+1);

            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = {"i", "like", "samsung", "mobile"};
        String key = "ilikesamsung";

//        String prefix = "l";
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
