class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        TreeNode root = construct(map,nums,0,nums.length-1);
        return root;
    }

    // It's like inorder tree construction;
    TreeNode construct(Map<Integer,Integer> map, int[] nums, int start, int end){
        if(start>end) return null;
        int max = findMax(nums,start,end);
        TreeNode root = new TreeNode(max);
        root.left = construct(map,nums,start,map.get(max)-1);
        root.right = construct(map,nums,map.get(max)+1,end);
        return root;
    }
    int findMax(int[] nums, int start, int end){
        int max = nums[start];
        for(int i=start;i<=end;i++){
            if(nums[i]>max) max = nums[i];
        }
        return max;
    }
}
