class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stk = new Stack<>();
        int area = 0;
      
        // Keep track of pse and nse at same time;
        // When the nse appears the pop() elements and calculate the area using the formula element*(nse-pse-1);
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && heights[i]<heights[stk.peek()]){
                int nse = i;
                int element = heights[stk.pop()];
                int pse = stk.isEmpty()?-1:stk.peek();
                area = Math.max(area,element*(nse-pse-1));
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            int nse = n;
            int element = heights[stk.pop()];
            int pse = stk.isEmpty()?-1:stk.peek();
            area = Math.max(area,element*(nse-pse-1));
        }
        return area;
    }
}
