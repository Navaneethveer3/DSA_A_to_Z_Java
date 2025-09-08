class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root!=null){

            // If both p, q values are less than root, move left;
            if(p.val<root.val && q.val<root.val){
                root = root.left;
            }

            // If both p, q values are greater than root, move right;
            else if(p.val>root.val && q.val>root.val){
                root = root.right;
            }

            // If one is lesser and one is greater , then the root is the Lowest Common Ancestor;
            else{
                return root;
            }
        }
        return root;
    }
}
