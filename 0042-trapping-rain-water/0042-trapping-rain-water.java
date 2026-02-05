class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int size = height.length;
        int[] prefix = new int[size];
        int[] suffix = new int[size];
        prefix[0] = height[0];
        suffix[size - 1] = height[size - 1];
        for(int i = 1; i < size; i++) prefix[i] = Math.max(height[i], prefix[i - 1]);
        for(int i =  size - 2; i >= 0; i--) suffix[i] = Math.max(height[i], suffix[i + 1]);
        for(int i = 1; i < size - 1; i++) {
            if(height[i] < prefix[i] && height[i] < suffix[i]) {
                ans += Math.min(prefix[i], suffix[i]) - height[i];
            }
        }
        return ans;
    }
}