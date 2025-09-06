class Solution {
    public int maxPathSum(TreeNode root) {
        int[] res = {root.val};
        findMax(root,res);
        return res[0];
    }
    int findMax(TreeNode root, int[] res){
        if(root==null) return 0;
        int left = Math.max(0,findMax(root.left,res));
        int right = Math.max(0,findMax(root.right,res));

        // Maximum of left+right+root.val and already stored res[0] value;
        res[0] = Math.max(res[0],left+right+root.val);
        return Math.max(left,right)+root.val;
    }
}
