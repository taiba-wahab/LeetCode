class Solution {
    public int largestRectangleArea(int[] heights) {
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
}