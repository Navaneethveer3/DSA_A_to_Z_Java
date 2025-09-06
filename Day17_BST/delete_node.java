class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        if(root.val==key){
            root = helper(root);
            return root;
        }
        TreeNode cur = root;
        while(cur!=null){
            if(cur.val>key){
                if(cur.left!=null && cur.left.val==key){
                    cur.left = helper(cur.left);
                    break;
                }
                else{
                    cur = cur.left;
                }
            }
            else{
                if(cur.right!=null && cur.right.val==key){
                    cur.right = helper(cur.right);
                    break;
                }
                else{
                    cur = cur.right;
                }
            }
        }
        return root;
    }

    // Find the maximum node from left subtree and attach the right part of the node to be deleted to the maximum node of the left subtree;
    TreeNode helper(TreeNode root){
        if(root==null) return root;
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        else{
            TreeNode right = root.right;
            TreeNode last =  findLast(root.left);
            last.right = right;
        }
        return root.left;
    }
    TreeNode findLast(TreeNode root){
        if(root.right==null) return root;
        return findLast(root.right);
    }
}
