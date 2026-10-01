class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int source, int destination) {
        if(source == destination) return true;
        visited[source] = true;
        for(int neighbour : graph.get(source)) {
            if(!visited[neighbour]) {
                boolean check = dfs(graph, visited, neighbour, destination);
                if(check) return true;
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
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
        return dfs(graph, visited, source, destination);
    }
}