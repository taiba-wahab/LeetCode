class Solution {
    public boolean bfs(int source, int destination, boolean[] visited, List<List<Integer>> graph) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        visited[source] = true;
        if(source == destination) return true;
        while(!q.isEmpty()) {
            int node = q.poll();
            visited[node] = true;
            if(node == destination) return true;
            for(int neighbour : graph.get(node)) {
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // BUILD ADJACENCY LIST
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
        // MAKE VISITED ARRAY
        boolean[] visited = new boolean[n];
        return bfs(source, destination, visited, graph);
    }
}