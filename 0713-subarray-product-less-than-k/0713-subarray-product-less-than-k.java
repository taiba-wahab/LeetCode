class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro = 1, count = 0, left = 0, right = 0;
        while(right < nums.length) {
            pro *= nums[right];
            while(left < nums.length && pro >= k) {
                pro /= nums[left];
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}