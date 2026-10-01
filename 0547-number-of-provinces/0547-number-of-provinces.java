class Solution {
    public void dfs(int node, boolean[] visited, int[][] isConnected) {
        visited[node] = true;
        for(int i = 0; i < isConnected.length; i++) {
            if(isConnected[node][i] == 1 && !visited[i]) {
                dfs(i, visited, isConnected);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        boolean[] visited = new boolean[isConnected.length];
        for(int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                dfs(i, visited, isConnected);
                provinces++;
            }
        }
        return provinces;
    }
}