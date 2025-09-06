class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        if(root==null) return level;
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);

        // Just keep a flag to add elements in zigzag way;
        boolean flag = true;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = bfs.remove();
                list.add(node.val);
                if(node.left!=null) bfs.add(node.left);
                if(node.right!=null) bfs.add(node.right);
            }
            if(flag){
                level.add(list);
                flag = false;
            }
            else{
                Collections.reverse(list);
                level.add(list);
                flag = true;
            }
        }
        return level;
    }
}
