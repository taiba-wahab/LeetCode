class Solution {
    public boolean dfs(int source, int destination, boolean[] visited, List<List<Integer>> graph) {
        if(source == destination) return true;
        visited[source] = true;
        for(int neighbour : graph.get(source)) {
            if(!visited[neighbour]) {
                if(dfs(neighbour, destination, visited, graph)) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        return dfs(source, destination, visited, graph);
    }
}