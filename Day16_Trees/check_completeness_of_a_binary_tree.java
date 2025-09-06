class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);

        // Keep a variable to handle null nodes if seen;
        boolean seen = false;
        while(!bfs.isEmpty()){
            TreeNode node = bfs.remove();
            if(node==null){
                seen = true;
            }
            else{

                // If the null node is already seen and present node is not null, then return false;
                if(seen) return false;
                bfs.add(node.left);
                bfs.add(node.right);
            }
        }
        return true;
    }
}
