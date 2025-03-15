class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0, answer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                count = 1;
            }
            else if(nums[i] > nums[i - 1]) {
                count++;
            }
            else {
                answer = Math.max(count,answer);
                count = 1;
            }
        }
        return Math.max(count,answer);
    }
}