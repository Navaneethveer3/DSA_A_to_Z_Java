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
