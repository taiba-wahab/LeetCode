class Solution {
    public int helper(int[][] grid, int i, int j, int m, int n) {
        grid[i][j] = 2;
        int area = 1;
        // up 
        if(i - 1 >= 0 && grid[i - 1][j] == 1) {
            int upArea = helper(grid, i - 1, j, m, n);
            area += upArea;
        }
        // down
        if(i + 1 < m && grid[i + 1][j] == 1) {
            int downArea = helper(grid, i + 1, j, m, n);
            area += downArea;
        }
        // right
        if(j + 1 < n && grid[i][j + 1] == 1) {
            int rightArea = helper(grid, i, j + 1, m, n);
            area += rightArea;
        }
        // left
        if(j - 1 >= 0 && grid[i][j - 1] == 1) {
            int leftArea = helper(grid, i, j - 1, m, n);
            area += leftArea;
        }
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    int area = helper(grid, i, j, m, n);
                    maxArea = Math.max(area, maxArea);
                }
                else {
                    continue;
                }
            }
        }
        return maxArea;
    }
}