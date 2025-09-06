class Solution {
    public int sumNumbers(TreeNode root) {
        return count(root,0);
    }
    int count(TreeNode root, int sum){
        if(root==null) return 0;
        sum = (sum*10)+root.val;
        if(root.left==null && root.right==null){
            return sum;
        }
        return count(root.left,sum)+count(root.right,sum);
    }
}
