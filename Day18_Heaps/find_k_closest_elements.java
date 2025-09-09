class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Tuple> pq = new PriorityQueue<>((a,b)->(a.diff==b.diff)?Integer.compare(a.val,b.val):Integer.compare(a.diff,b.diff));
        for(int i : arr){
            int abs = Math.abs(i-x);
            pq.add(new Tuple(i,abs));
        }

        // Use another Heap to make the elements be returned in a sorted order;
        Queue<Integer> sortedPQ = new PriorityQueue<>();
        while(sortedPQ.size()<k){
            sortedPQ.add(pq.remove().val);
        }
        List<Integer> kElements = new ArrayList<>();
        while(!sortedPQ.isEmpty()){
            kElements.add(sortedPQ.remove());
        }
        return kElements;
    }
}
class Tuple{
    int val, diff;
    Tuple(int val, int diff){
        this.val = val;
        this.diff = diff;
    }
}
