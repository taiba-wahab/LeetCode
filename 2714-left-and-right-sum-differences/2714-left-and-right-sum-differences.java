class Solution {
    public int leftSum(int[] nums, int a, int b) {
        int left = 0;
        for(int i = 0; i < b; i++) {
            left += nums[i];
        }
        return left;
    }
    public int rightSum(int[] nums, int a, int b) {
        int right = 0;
        for(int i = a; i < b; i++) {
            right += nums[i];
        }
        return right;
    }
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            int left = leftSum(nums, 0, i);
            int right = rightSum(nums, i + 1, n);
            ans[i] = Math.abs(left - right);
        }
        return ans;
    }
}