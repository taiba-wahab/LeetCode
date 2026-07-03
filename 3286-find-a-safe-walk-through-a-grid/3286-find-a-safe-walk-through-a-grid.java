class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] healthGrid = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();
        if(grid.get(0).get(0) == 1) health--;
        healthGrid[0][0] = health;
        if(health > 0) queue.offer(new int[]{0, 0, health});
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int[] q = queue.poll();
                int r = q[0];
                int c = q[1];
                int currHealth = q[2];
                if(r - 1 >= 0) {
                    int newHealth = currHealth;
                    if(grid.get(r - 1).get(c) == 1) newHealth--;
                    if(healthGrid[r - 1][c] < newHealth && newHealth > 0) {
                        healthGrid[r - 1][c] = newHealth;
                        queue.offer(new int[]{r - 1, c, newHealth});
                        if(r - 1 == m - 1 && c == n - 1) return true;
                    }
                }
                if(r + 1 < m) {
                    int newHealth = currHealth;
                    if(grid.get(r + 1).get(c) == 1) newHealth--;
                    if(healthGrid[r + 1][c] < newHealth && newHealth > 0) {
                        healthGrid[r + 1][c] = newHealth;
                        queue.offer(new int[]{r + 1, c, newHealth});
                        if(r + 1 == m - 1 && c == n - 1) return true;
                    }
                }
                if(c - 1 >= 0) {
                    int newHealth = currHealth;
                    if(grid.get(r).get(c - 1) == 1) newHealth--;
                    if(healthGrid[r][c - 1] < newHealth && newHealth > 0) {
                        healthGrid[r][c - 1] = newHealth;
                        queue.offer(new int[]{r, c - 1, newHealth});
                        if(r == m - 1 && c - 1 == n - 1) return true;
                    }
                }
                if(c + 1 < n) {
                    int newHealth = currHealth;
                    if(grid.get(r).get(c + 1) == 1) newHealth--;
                    if(healthGrid[r][c + 1] < newHealth && newHealth > 0) {
                        healthGrid[r][c + 1] = newHealth;
                        queue.offer(new int[]{r, c + 1, newHealth});
                        if(r == m - 1 && c + 1 == n - 1) return true;
                    }
                }
            }
        }
        return false;
    }
}