package trie;

public class LongestWord {
    static class Node {
        Node[] children;
        boolean eow;
        public Node(){
            this.children = new Node[26];
            this.eow = false;
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

    static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i = 0; i < 26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i + 'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);

                temp.deleteCharAt(temp.length() -1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(int i = 0; i < words.length; i++){
            insert(words[i]);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
