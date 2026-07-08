class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[2 * nums.length - i - 1] = nums[i];
        }
        return ans;
    }
}