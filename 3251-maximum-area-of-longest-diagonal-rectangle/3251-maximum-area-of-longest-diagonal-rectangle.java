class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int diagonal = 0;
        int maxDiagonal = 0;
        int area = 0;
        int maxArea = 0;
        int check = 0;
        for(int i = 0; i < dimensions.length; i++) {
            diagonal = dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1];
            area = dimensions[i][0] * dimensions[i][1];
            if(diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
            else if(diagonal == maxDiagonal && maxArea < area) {
                check++;
                maxArea = area;
            }
            else {
                maxDiagonal = maxDiagonal;
            }
        }
        return maxArea;
    }
}