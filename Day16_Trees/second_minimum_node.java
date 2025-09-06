class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        int first = root.val;
        long second = Long.MAX_VALUE;
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            TreeNode node = stk.pop();
            if(node.val>first && node.val<second){
                second = node.val;
            }
            if(node.right!=null) stk.push(node.right);
            if(node.left!=null) stk.push(node.left);
        }
        return second==Long.MAX_VALUE?-1:(int)second;
    }
}
