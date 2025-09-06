class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> paths = new ArrayList<>();
        findPaths(paths,new ArrayList<>(),root,targetSum);
        return paths;
    }
    void findPaths(List<List<Integer>> paths, List<Integer> list, TreeNode root, int target){
        if(root==null) return;

        // Just use Backtracking logic;
        list.add(root.val);
        if(root.left==null && root.right==null && root.val==target){
            paths.add(new ArrayList<>(list));
        } else{
            findPaths(paths,list,root.left,target-root.val);
            findPaths(paths,list,root.right,target-root.val);
        }
        list.remove(list.size()-1);
    }
}
