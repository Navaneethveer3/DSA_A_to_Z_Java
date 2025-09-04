class MapSum {
    TrieNode root;
    Map<String,Integer> map;
    public MapSum() {
        root = new TrieNode();
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {

        // Calculate the diff if the key already exists;
        int diff = val - map.getOrDefault(key,0);
        map.put(key,val);
        TrieNode cur = root;
        for(char c : key.toCharArray()){
            int ind = c-'a';
            if(cur.children[ind]==null){
                cur.children[ind] = new TrieNode();
            }
            cur = cur.children[ind];

            // Instead of modifying just add the difference to make track of new sum at each letter node;
            cur.sum += diff;
        }
    }
    
    public int sum(String prefix) {
        TrieNode cur = root;
        for(char c : prefix.toCharArray()){
            int ind = c-'a';
            if(cur.children[ind]==null) return 0;
            cur = cur.children[ind];
        }
        return cur.sum;
    }
}
class TrieNode{
    TrieNode[] children;
    boolean isLeaf;
    int sum;
    TrieNode(){
        children = new TrieNode[26];
        isLeaf = false;
        sum = 0;
    }
}
