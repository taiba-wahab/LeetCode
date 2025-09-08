class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] rows : image) {
            for(int i = 0 ; i < (image[0].length + 1) / 2; i++) {
                int temp = rows[i] ^ 1;
                rows[i] = rows[image[0].length - i - 1] ^ 1;
                rows[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}