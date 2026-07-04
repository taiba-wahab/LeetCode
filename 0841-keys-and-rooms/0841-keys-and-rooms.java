class Solution {
    public void dfs(int node, List<List<Integer>> rooms, boolean[] visited) {
        visited[node] = true;
        for(int neighbour : rooms.get(node)) {
            if(!visited[neighbour]) {
                dfs(neighbour, rooms, visited);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);
        for(int i = 0; i < visited.length; i++) {
            if(!visited[i]) return false;
        }
        return true;
    }
}