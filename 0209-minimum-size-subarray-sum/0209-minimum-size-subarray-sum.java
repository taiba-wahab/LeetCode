class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, ans = Integer.MAX_VALUE, sum = 0, right = 0;
        while(right < nums.length) {
            sum += nums[right];
            while(sum >= target) {
                int len = right - left + 1;
                ans = Math.min(ans, len);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}