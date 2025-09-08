class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer,Integer> map = new HashMap<>();
        dfs(root,map);
        Queue<Tuple> pq = new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            pq.add(new Tuple(m.getKey(),m.getValue()));
        }
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while(!pq.isEmpty()){
            int val = pq.peek().val;
            int freq = pq.remove().freq;
            if(count<=freq){
                count = freq;
                list.add(val);
            }
            else{
                break;
            }
        }
        int[] kFreq = new int[list.size()];
        for(int i=0;i<list.size();i++){
            kFreq[i] = list.get(i);
        }
        return kFreq;
    }
    int dfs(TreeNode root, Map<Integer,Integer> map){
        if(root==null) return 0;
        int left = dfs(root.left,map);
        int right = dfs(root.right,map);

        // Total sum of left subtree, right subtree and node's value;
        int total = root.val+left+right;
        map.put(total,map.getOrDefault(total,0)+1);
        return total;
    }
}
class Tuple{
    int val, freq;
    Tuple(int val, int freq){
        this.val = val;
        this.freq = freq;
    }
}
