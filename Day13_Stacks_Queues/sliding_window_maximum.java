class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        int l = 0;

        // Make sure the greatest value lies in front of the Deque;
        for(int r=0;r<n;r++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r]){
                dq.removeLast();
            }
            dq.addLast(r);
            while(l>dq.peekFirst()){
                dq.removeFirst();
            }
            if(r-l+1==k){
                list.add(nums[dq.peekFirst()]);
                l++;
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
