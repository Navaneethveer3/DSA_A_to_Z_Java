class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int[] in = new int[n];
        for(int[] pre : prerequisites){
            int u = pre[1];
            int v = pre[0];
            graph.get(u).add(v);
            in[v]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i]==0){
                queue.add(i);
            }
        }

        // Generate Toposort of the graph;
        List<Integer> topo = new ArrayList<>();
        int count = 0;
        while(!queue.isEmpty()){
            int node = queue.remove();
            topo.add(node);
            count++;
            for(int i : graph.get(node)){
                in[i]--;
                if(in[i]==0){
                    queue.add(i);
                }
            }
        }
        if(count!=n){
            return new int[]{};
        }
        int[] order = new int[n];
        for(int i=0;i<n;i++){
            order[i] = topo.get(i);
        }
        return order;
    }
}
