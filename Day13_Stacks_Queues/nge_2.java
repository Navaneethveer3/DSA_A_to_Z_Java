class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> stk = new Stack<>();
        int[] nge = new int[n];
        for(int i=(2*n)-1;i>=0;i--){
            while(!stk.isEmpty() && nums[i%n]>=stk.peek()){
                stk.pop();
            }
            if(i<n) nge[i] = stk.isEmpty()?-1:stk.peek();
            stk.push(nums[i%n]);
        }
        return nge;
    }
}
