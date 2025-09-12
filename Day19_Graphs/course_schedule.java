class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int[] in = new int[n];

        // Construct the directed graph using the given prerequisites;
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
        int count = 0;
        while(!queue.isEmpty()){
            int node = queue.remove();
            count++;
            for(int i : graph.get(node)){
                in[i]--;
                if(in[i]==0){
                    queue.add(i);
                }
            }
        }
        return (count==n);
    }
}
