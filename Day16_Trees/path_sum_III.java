class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> map = new HashMap<>();
        map.put((long)0,1);
        return dfs(map,root,targetSum,0);
    }
    int dfs(Map<Long,Integer> map, TreeNode root, int target, long sum){
        if(root==null) return 0;
        sum += root.val;

        // Use Prefix sum technique to handle the target exists or not;
        int count = map.getOrDefault(sum-target,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        count += dfs(map,root.left,target,sum);
        count += dfs(map,root.right,target,sum);

        // Backtrack to set back the sum to count-1;
        map.put(sum,map.get(sum)-1);
        return count;
    }
}
