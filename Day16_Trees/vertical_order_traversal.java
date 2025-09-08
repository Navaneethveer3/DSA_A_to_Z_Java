class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        // This map maintains an ascending order of cols from left to right and nested map maintains the order of insertion of nodes in each row;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> colMap = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root,0,0));
        while(!queue.isEmpty()){
            TreeNode node = queue.peek().node;
            int row = queue.peek().row;
            int col = queue.remove().col;
            if(!colMap.containsKey(col)){
                colMap.put(col,new TreeMap<>());
            }
            if(!colMap.get(col).containsKey(row)){
                colMap.get(col).put(row,new PriorityQueue<>());
            }
            colMap.get(col).get(row).add(node.val);
            if(node.left!=null){
                queue.add(new Tuple(node.left,row+1,col-1));
            }
            if(node.right!=null){
                queue.add(new Tuple(node.right,row+1,col+1));
            }
        }
        List<List<Integer>> vert = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> c : colMap.values()){
            vert.add(new ArrayList<>());
            for(PriorityQueue<Integer> r : c.values()){
                while(!r.isEmpty()){
                    vert.get(vert.size()-1).add(r.remove());
                }
            }
        }
        return vert;
    }
}
class Tuple{
    TreeNode node;
    int row, col;
    Tuple(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}
