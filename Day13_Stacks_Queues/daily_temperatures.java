class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int[] temp = new int[n];

        // Use nge technique;
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && temperatures[i]>=temperatures[stk.peek()]){
                stk.pop();
            }
            temp[i] = stk.isEmpty()?0:stk.peek()-i;
            stk.push(i);
        }
        return temp;
    }
}
