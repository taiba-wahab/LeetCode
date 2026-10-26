class Solution {
    public long helper(int[][] grid, int i, int j, int m, int n, long sum) {
        sum += grid[i][j];
        grid[i][j] = -1;
        if(i - 1 >= 0 && grid[i - 1][j] > 0) {
            sum = helper(grid, i - 1, j, m, n, sum);
        }
        if(i + 1 < m && grid[i + 1][j] > 0) {
            sum = helper(grid, i + 1, j, m, n, sum);
        }
        if(j - 1 >= 0 && grid[i][j - 1] > 0) {
            sum = helper(grid, i, j - 1, m, n, sum);
        }
        if(j + 1 < n && grid[i][j + 1] > 0) {
            sum = helper(grid, i, j + 1, m, n, sum);
        }
        return sum;
    }
    public int countIslands(int[][] grid, int k) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                long sum = 0;
                if(grid[i][j] > 0) {
                    sum = helper(grid, i, j, m, n, sum);
                    System.out.println(sum);
                    if(sum % k == 0) {
                        count++;
                    }
                }
                else continue;
            }
        }
        return count;
    }
}