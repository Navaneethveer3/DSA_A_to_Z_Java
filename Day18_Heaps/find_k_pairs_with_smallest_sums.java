class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        Queue<Tuple> pq = new PriorityQueue<>((a,b)->Integer.compare(a.sum,b.sum));
        for(int i=0;i<Math.min(k,n1);i++){

            // Use indexes of both arrays;
            pq.add(new Tuple(nums1[i]+nums2[0],i,0));
        }
        List<List<Integer>> smallest = new ArrayList<>();
        while(!pq.isEmpty() && smallest.size()<k){
            int i = pq.peek().i;
            int j = pq.remove().j;

            // Popped elements sum will always be minimum;
            smallest.add(Arrays.asList(nums1[i],nums2[j]));

            // Use the next of the jth next element and ith element combination, as the popped element sum is always minimum;
            if(j+1<n2){
                pq.add(new Tuple(nums1[i]+nums2[j+1],i,j+1));
            }
        }
        return smallest;
    }
}
class Tuple{
    int sum, i, j;
    Tuple(int sum, int i, int j){
        this.sum = sum;
        this.i = i;
        this.j = j;
    }
}
