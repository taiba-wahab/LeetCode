class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        Queue<int[]> queue = new LinkedList<>();
        int m = grid.length; 
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 2)
                queue.offer(new int[]{i, j});
            }
        }
        while(!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;
            for(int i = 0; i < size; i++) {
                int [] current = queue.poll();
                int r = current[0];
                int c = current[1];
                if(r - 1 >= 0 && grid[r - 1][c] == 1) {
                    rotted = true;
                    grid[r - 1][c] = 2;
                    queue.offer(new int[]{r - 1, c});
                }
                if(r + 1 < m && grid[r + 1][c] == 1) {
                    rotted = true;
                    grid[r + 1][c] = 2;
                    queue.offer(new int[]{r + 1, c});
                }
                if(c - 1 >= 0 && grid[r][c - 1] == 1) {
                    rotted = true;
                    grid[r][c - 1] = 2;
                    queue.offer(new int[]{r, c - 1});
                }
                if(c + 1 < n  && grid[r][c + 1] == 1) {
                    rotted = true;
                    grid[r][c + 1] = 2;
                    queue.offer(new int[]{r, c + 1});
                }
            }
            if(rotted) time++;
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) return -1;
            }
        }
        return time;
    }
}