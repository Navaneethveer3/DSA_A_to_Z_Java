class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = construct(map,preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }
    TreeNode construct(Map<Integer,Integer> map, int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode root = new TreeNode(pre[preStart]);
        int inRoot = map.get(root.val);

        // nodesLeft is the count of the nodes that are left to the root;
        int nodesLeft = inRoot-inStart;
        root.left = construct(map,pre,preStart+1,preStart+nodesLeft,in,inStart,inRoot-1);
        root.right = construct(map,pre,preStart+nodesLeft+1,preEnd,in,inRoot+1,inEnd);
        return root;
    }
}
