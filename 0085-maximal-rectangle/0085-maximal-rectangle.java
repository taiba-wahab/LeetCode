class Solution {
    public int largestHist(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length; i++) {
            while(!st.isEmpty() && heights[st.peek()] > heights[i]) {
                int ind = st.peek();
                st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, heights[ind] * (nse - pse - 1));
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            int nse = heights.length;
            int ind = st.peek();
            st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, heights[ind] * (nse - pse - 1));
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int maxArea = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] pSum = new int[n][m];
        for(int j = 0; j < m; j++) {
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum += matrix[i][j] - '0';
                if(matrix[i][j] == '0') sum = 0;
                pSum[i][j] = sum;
            }
        }
        for(int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, largestHist(pSum[i]));
        }
        return maxArea;
    }
}