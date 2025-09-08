public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder ser = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node==null){
                ser.append("n ");
            }
            else{
                ser.append(node.val+" ");
            }

            // Add null nodes also to join the null's of the node during deserialization;
            if(node!=null){
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return ser.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==0) return null;
        String[] des = data.split("\\s+");
        TreeNode root = new TreeNode(Integer.parseInt(des[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for(int i=1;i<des.length;i++){
            TreeNode node = queue.remove();

            // i is the left node of the current node;
            if(!des[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(des[i]));
                node.left = left;
                queue.add(left);
            }

            // i+1 is the right node of the current node;
            if(!des[++i].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt(des[i]));
                node.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
