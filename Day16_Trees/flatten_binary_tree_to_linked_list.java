class Solution {
    TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null) return;

        // Go to complete right;
        flatten(root.right);
        flatten(root.left);

        // Replace the nodes by keeping the prev node and modifying the structure of the Tree;
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
