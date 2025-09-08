class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 1;
        while(!queue.isEmpty()){

            // Find the above level of required depth, if found break the while loop;
            if(level==depth-1) break;
            int size = queue.size();
            level++;
            for(int i=0;i<size;i++){
                TreeNode node = queue.remove();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();

            // Create two nodes for left child and right child;
            TreeNode l = new TreeNode(val);
            TreeNode r = new TreeNode(val);

            // Point the left child and right child of current node to the created left, right required nodes;
            l.left = node.left;
            r.right = node.right;
            node.left = l;
            node.right = r;
        }
        return root;
    }
}
