class Solution {
    public int sum(int[] nums, int i, int j) {
        int sum = 0;
        while(i <= j) {
            sum += nums[i];
            i++;
        }
        return sum;
    }
    public int countValidSelections(int[] nums) {
        int totalSum = sum(nums, 0, nums.length - 1);
        int leftSum = 0;
        int rightSum = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                rightSum = totalSum - leftSum;
                int diff = Math.abs(leftSum - rightSum);
                if(diff == 0) ans += 2;
                if(diff == 1) ans += 1;
            }
            leftSum += nums[i];
        }
        return ans;
    }
}