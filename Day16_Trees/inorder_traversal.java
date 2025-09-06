class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        if(root==null) return in;
        Stack<TreeNode> stk = new Stack<>();
        TreeNode cur = root;

        // true represents both the node is not null and stack is not empty;
        while(true){
            if(cur!=null){
                stk.push(cur);
                cur = cur.left;
            }
            else{
                if(stk.isEmpty()) break;
                cur = stk.pop();
                in.add(cur.val);
                cur = cur.right;
            }
        }
        return in;
    }
}
