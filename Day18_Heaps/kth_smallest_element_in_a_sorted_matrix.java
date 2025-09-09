class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        Queue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int[] i : matrix){
            for(int j : i){
                pq.add(j);
            }
        }
        while(pq.size()!=k){
            pq.remove();
        }
        return pq.peek();
    }
}
