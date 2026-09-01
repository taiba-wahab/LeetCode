class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int left = 0, right = 0, flips = 0, count = 0;
        while(right < nums.length) {
            if(nums[right] == 0) {
                flips++;
                count++;
            }
            while(flips > k) {
                if(nums[left] == 0) flips--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}