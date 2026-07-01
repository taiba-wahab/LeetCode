class Solution {
    public void helper(int[][] image, int sr, int sc, int color, int m, int n, int val) {
        image[sr][sc] = color;
        // up
        if(sr - 1 >= 0 && image[sr - 1][sc] == val) {
            helper(image, sr - 1, sc, color, m, n, val);
        }
        // down
        if(sr + 1 < m && image[sr + 1][sc] == val) {
            helper(image, sr + 1, sc, color, m, n, val);
        }
        // right
        if(sc + 1 < n && image[sr][sc + 1] == val) {
            helper(image, sr, sc + 1, color, m, n, val);
        }
        // left 
        if(sc - 1 >= 0 && image[sr][sc - 1] == val) {
            helper(image, sr, sc - 1, color, m, n, val);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int m = image.length;
       int n = image[0].length;
       int original = image[sr][sc];
       if(original != color)
        helper(image, sr, sc, color,  m, n, original);
       return image;
    }
}