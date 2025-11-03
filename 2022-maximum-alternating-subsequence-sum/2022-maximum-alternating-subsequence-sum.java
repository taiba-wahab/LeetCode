class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                ans += nums[i] - nums[i - 1];
            }
        }
        return ans;
    }
}