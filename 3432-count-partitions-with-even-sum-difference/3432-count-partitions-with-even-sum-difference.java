class Solution {
    public int leftSum(int[] nums, int idx) {
        int left = 0;
        for(int i = 0; i <= idx; i++) {
            left += nums[i];
        }
        return left;
    }
    public int rightSum(int[] nums, int idx) {
        int right = 0;
        for(int i = idx + 1; i < nums.length; i++) {
            right += nums[i];
        }
        return right;
    }
    public int countPartitions(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int left = leftSum(nums, i);
            int right = rightSum(nums, i);
            if((left - right) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}