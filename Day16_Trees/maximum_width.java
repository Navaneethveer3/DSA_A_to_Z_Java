class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root,0));
        int width = 0;
        while(!queue.isEmpty()){
            int start = 0;
            int end = 0;
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode node = queue.peek().node;
                int curWidth = queue.remove().curWidth;
                if(i==0) start = curWidth;
                if(i==size-1) end = curWidth;
                if(node.left!=null) queue.add(new Tuple(node.left,2*curWidth+1));
                if(node.right!=null) queue.add(new Tuple(node.right,2*curWidth+2));
            }
            width = Math.max(width,end-start+1);
        }
        return width;
    }
}
class Tuple{
    TreeNode node;
    int curWidth;
    Tuple(TreeNode node, int curWidth){
        this.node = node;
        this.curWidth = curWidth;
    }
}
