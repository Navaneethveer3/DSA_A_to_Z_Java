class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left,root.right);
    }
    boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val==q.val) && isSameTree(p.left,q.right) && isSameTree(p.right,q.left);
    }
}
