class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int[][] temp = new int[m][n];
        int count = 1;
        while(count <= k) {
            if(count % 2 != 0) {
                for(int i = 0; i < m; i++) {
                    for(int j = 0; j < n; j++) {
                        if(j == n - 1 && i == m - 1) {
                            temp[0][0] = grid[i][j];
                        }
                        else if(j == n - 1) {
                            temp[i + 1][0] = grid[i][j];
                        }
                        else {
                            temp[i][j + 1] = grid[i][j]; 
                        }
                    }
                }
            }
            else {
                for(int i = 0; i < m; i++) {
                    for(int j = 0; j < n; j++) {
                        if(j == n - 1 && i == m - 1) {
                            grid[0][0] = temp[i][j];
                        }
                        else if(j == n - 1) {
                            grid[i + 1][0] = temp[i][j];
                        }
                        else {
                            grid[i][j + 1] = temp[i][j]; 
                        }
                    }
                }
            }
            count++;
        }
        if(k % 2 == 0) {
            for(int i = 0; i < m; i++) {
                List<Integer> row = new ArrayList<>();
                for(int j = 0; j < n; j++) {
                    row.add(grid[i][j]);
                }
                ans.add(row);
            }
        }
        else {
            for(int i = 0; i < m; i++) {
                List<Integer> row = new ArrayList<>();
                for(int j = 0; j < n; j++) {
                    row.add(temp[i][j]);
                }
                ans.add(row);
            }
        }
        
        return ans;
    }
}