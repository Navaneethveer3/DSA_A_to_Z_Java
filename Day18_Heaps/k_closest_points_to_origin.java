class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // Create a Heap based on sqrt of the distance between the point to the origin;
        Queue<Tuple> pq = new PriorityQueue<>((a,b)->Double.compare(a.sqrt,b.sqrt));
        for(int[] i : points){
            int u = Math.abs(i[0]*i[0]);
            int v = Math.abs(i[1]*i[1]);
            double sqrt = Math.sqrt(u+v);
            pq.add(new Tuple(sqrt,i[0],i[1]));
        }
        int[][] kPoints = new int[k][2];
        int ind = 0;
        while(ind<k){
            int u = pq.peek().i;
            int v = pq.remove().j;
            kPoints[ind][0] = u;
            kPoints[ind++][1] = v;
        }
        return kPoints;
    }
}
class Tuple{
    double sqrt;
    int i, j;
    Tuple(double sqrt, int i, int j){
        this.sqrt = sqrt;
        this.i = i;
        this.j = j;
    }
}
