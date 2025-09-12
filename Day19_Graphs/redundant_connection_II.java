class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int m = edges[0].length;
        DisjointSet dj = new DisjointSet(n);
        int[][] par = new int[n+1][1];
        for(int i=0;i<=n;i++){
            Arrays.fill(par[i],-1);
        }

        // To track first edge when a node has two parents;
        int[] c1 = {-1,0};

        // To track second edge when a node has two parents;
        int[] c2 = {-1,0};

        // To track a cycle if exists;
        int[] ce = {-1,0};
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            if(par[v][0]!=-1){
                c1[0] = par[v][0];
                c1[1] = v;
                c2[0] = u;
                c2[1] = v;
                continue;
            }
            else{
                par[v][0] = u;
            }
            if(dj.findULP(u)==dj.findULP(v)){
                ce = edge;
            }
            else{
                dj.findUnion(u,v);
            }
        }
        if(c1[0]!=-1 && c2[0]!=-1){
            if(ce[0]!=-1){
                return c1;
            }
            else{
                return c2;
            }
        }
        if(ce[0]!=-1){
            return ce;
        }
        return new int[]{0,0};
    }
}
class DisjointSet{
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    DisjointSet(int n){
        for(int i=0;i<=n;i++){
            parent.add(i);
            size.add(i);
        }
    }
    int findULP(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ulp = findULP(parent.get(node));
        parent.set(node,ulp);
        return ulp;
    }
    void findUnion(int u, int v){
        int ulp_u = findULP(u);
        int ulp_v = findULP(v);
        int totalSize = size.get(ulp_u)+size.get(ulp_v);
        if(ulp_u==ulp_v) return;
        if(size.get(ulp_u)>size.get(ulp_v)){
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,totalSize);
        }
        else{
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,totalSize);
        }
    }
}
