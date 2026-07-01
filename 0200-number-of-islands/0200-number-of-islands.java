class Solution {
    public void helper(char[][] grid, int i, int j, int m, int n) {
        grid[i][j] = '2';
        // up 
        if(i - 1 >= 0 && grid[i - 1][j] == '1') {
            helper(grid, i - 1, j, m, n);
        }
        // down
        if(i + 1 < m && grid[i + 1][j] == '1') {
            helper(grid, i + 1, j, m, n);
        }
        // right
        if(j + 1 < n && grid[i][j + 1] == '1') {
            helper(grid, i, j + 1, m, n);
        }
        // left
        if(j - 1 >= 0 && grid[i][j - 1] == '1') {
            helper(grid, i, j - 1, m, n);
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    helper(grid, i, j, m, n);
                    count++;
                }
                else continue;
            }
        }
        return count;
    }
}