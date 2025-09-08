class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null){
            return root;
        }

        // Move to complete right and add the sum one by one node's value from the complete right;
        convertBST(root.right);
        sum += root.val;

        // Update the node's value using the cumulative sum, this sum tracks the complete sum of the right part from that node;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
