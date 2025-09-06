class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        if(root==null) return avg;
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            double sum = 0;
            int count = 0;
            for(int i=0;i<size;i++){
                TreeNode node = bfs.remove();
                sum += node.val;
                count++;
                if(node.left!=null) bfs.add(node.left);
                if(node.right!=null) bfs.add(node.right);
            }
            avg.add(sum/count);
        }
        return avg;
    }
}
