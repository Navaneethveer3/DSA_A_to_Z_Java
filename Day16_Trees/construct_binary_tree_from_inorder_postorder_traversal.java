class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = construct(map,inorder,0,inorder.length-1,postorder,0,postorder.length-1);
        return root;
    }
    TreeNode construct(Map<Integer,Integer> map, int[] in, int inStart, int inEnd, int[] pos, int posStart, int posEnd){
        if(inStart>inEnd || posStart>posEnd) return null;
        TreeNode root = new TreeNode(pos[posEnd]);
        int inRoot = map.get(pos[posEnd]);
        int nodesLeft = inRoot-inStart;

        // It's just reversal of the preorder and inorder construction;
        root.left = construct(map,in,inStart,inRoot-1,pos,posStart,posStart+nodesLeft-1);
        root.right = construct(map,in,inRoot+1,inEnd,pos,posStart+nodesLeft,posEnd-1);
        return root;
    }
}
