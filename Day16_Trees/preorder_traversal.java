class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        if(root==null) return pre;
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode node = stk.pop();
            pre.add(node.val);
            if(node.right!=null) stk.push(node.right);
            if(node.left!=null) stk.push(node.left);
        }
        return pre;
    }
}
