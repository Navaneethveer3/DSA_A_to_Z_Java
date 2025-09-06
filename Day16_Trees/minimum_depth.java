class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;

        // If left is null return right's minimum depth;
        if(root.left==null){
            return 1+minDepth(root.right);
        }

        // If right is null return left's minimum depth;
        if(root.right==null){
            return 1+minDepth(root.left);
        }

        // If both are not null, return minimum of the both left and right;
        return 1+Math.min(minDepth(root.left),minDepth(root.right));
    }
}
