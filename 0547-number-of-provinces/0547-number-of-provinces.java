class Solution {
    public void dfs(int node, boolean[] visited, List<List<Integer>> graph) {
        visited[node] = true;
        for(int neighbor : graph.get(node)) {
            if(!visited[neighbor]) {
                dfs(neighbor, visited, graph);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < isConnected.length; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < isConnected.length; i++) {
            for(int j = i + 1; j < isConnected[0].length; j++) {
                if(i != j && isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            } 
        }
        boolean[] visited = new boolean[graph.size()];

        for(int i = 0; i < graph.size(); i++) {
            if(!visited[i]) {
                dfs(i, visited, graph);
                provinces++;
            }
        }
        return provinces;
    }
}