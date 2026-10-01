class Solution {
    int nodes = 0;
    int edge = 0;
    public void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;
        nodes++;
        edge += graph.get(node).size();
        for(int neighbour : graph.get(node)) {
            if(!visited[neighbour]) {
                dfs(neighbour, visited, graph);
            }
        }
        return;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); 
        for(int i = 0; i < n; i++) { 
            graph.add(new ArrayList<>()); 
        } 
        boolean[] visited = new boolean[n]; 
        for(int i = 0; i < edges.length; i++) { 
            int u = edges[i][0]; 
            int v = edges[i][1]; 
            graph.get(u).add(v); 
            graph.get(v).add(u); 
        } 
        int count = 0;
        for(int i = 0; i < n; i++) { 
            nodes = 0;
            if(!visited[i]) { 
                edge = 0;
                dfs(i, visited, graph); 
                if((nodes * (nodes - 1)) / 2 == edge / 2) count++;
            } 
        } 
        return count;
    }
}