class Solution {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode cur = root;
        int i = 0;
        while(cur!=null){
            if(cur.left==null){
                i++;
                if(i==k) return cur.val;
                cur = cur.right;
            }
            else{
                TreeNode prev = cur.left;
                while(prev.right!=null && prev.right!=cur){
                    prev = prev.right;
                }
                if(prev.right==null){
                    prev.right = cur;
                    cur = cur.left;
                }
                else{
                    i++;
                    if(i==k) return cur.val;
                    prev.right = null;
                    cur = cur.right;
                }
            }
        }
        return 0;
    }
}
