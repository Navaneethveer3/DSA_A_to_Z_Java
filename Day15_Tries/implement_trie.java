class Trie {

    // Use TrieNode class;
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()){
            int ind = c-'a';
            if(cur.children[ind]==null){
                cur.children[ind] = new TrieNode();
            }
            cur = cur.children[ind];
        }
        cur.isLeaf = true;
    }
    
    public boolean search(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()){
            int ind = c-'a';
            if(cur.children[ind]==null){
                return false;
            }
            cur = cur.children[ind];
        }
        return cur.isLeaf;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(char c : prefix.toCharArray()){
            int ind = c-'a';
            if(cur.children[ind]==null){
                return false;
            }
            cur = cur.children[ind];
        }
        return true;
    }
}
class TrieNode{
    TrieNode[] children;
    boolean isLeaf;
    TrieNode(){
        children = new TrieNode[26];
        isLeaf = false;
    }
}
