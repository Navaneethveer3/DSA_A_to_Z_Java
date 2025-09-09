class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i : stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int f = pq.remove();
            int s = pq.remove();
            if(f!=s){
                pq.add(Math.abs(f-s));
            }
        }
        return pq.isEmpty()?0:pq.peek();
    }
}
