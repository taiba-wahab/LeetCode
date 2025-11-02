class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int count = 0;
        int[][] grid = new int[m][n];
        for (int[] g : guards) grid[g[0]][g[1]] = 2;
        for (int[] w : walls) grid[w[0]][w[1]] = 1;
        // sweep left to right
        for(int i = 0; i < m; i++) {
            boolean watching = false;
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    watching = false;
                }
                else if(grid[i][j] == 2) {
                    watching = true;
                }
                else if(grid[i][j] == 0 && watching == true) {
                    grid[i][j] = 3;
                }
            }
        }
            // sweep right to left
        for(int i = 0; i < m; i++) {
            boolean watching = false;
            for(int j = n - 1; j >= 0; j--) {
                if(grid[i][j] == 1) {
                    watching = false;
                }
                else if(grid[i][j] == 2) {
                    watching = true;
                }
                else if(grid[i][j] == 0 && watching == true) {
                    grid[i][j] = 3;
                }
            }
        }
            // sweep top to bottom
        for(int j = 0; j < n; j++) {
            boolean watching = false;
            for(int i = 0; i < m; i++) {
                if(grid[i][j] == 1) {
                    watching = false;
                }
                else if(grid[i][j] == 2) {
                    watching = true;
                }
                else if(grid[i][j] == 0 && watching == true) {
                    grid[i][j] = 3;
                }
            }
        }
            // sweep bottom to up
        for(int j = 0; j < n; j++) {
            boolean watching = false;
            for(int i = m  - 1; i >= 0; i--) {
                if(grid[i][j] == 1) {
                    watching = false;
                }
                else if(grid[i][j] == 2) {
                    watching = true;
                }
                else if(grid[i][j] == 0 && watching == true) {
                    grid[i][j] = 3;
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 0) count++;
            }
        }
        return count;
    }
}