class Solution {
    public Node cloneGraph(Node node) {
        Map<Node,Node> map = new HashMap<>();
        return dfs(map,node);
    }
    static Node dfs(Map<Node,Node> map, Node node){
        if(node==null) return null;
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node cloned = new Node(node.val);
        map.put(node,cloned);
        for(Node n : node.neighbors){
            cloned.neighbors.add(dfs(map,n));
        }
        return cloned;
    }
}
