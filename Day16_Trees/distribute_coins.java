class Solution {
    public int distributeCoins(TreeNode root) {
        int[] res = {0};
        dfs(root,res);
        return res[0];
    }
    int dfs(TreeNode root, int[] res){
        if(root==null) return 0;
        int left = dfs(root.left,res);
        int right = dfs(root.right,res);

        // Each node should have each coin;
        int total = left+right+root.val-1;
        res[0] += Math.abs(total);
        return total;
    }
}
