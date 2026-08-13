class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int answer = 0;
        int streak = 0;
        if(nums.length < 3) return 0;
        int diff = nums[1] - nums[0];
        for(int i = 2; i < nums.length; i++) {
            int currDiff = nums[i] - nums[i - 1];
            if(diff == currDiff) {
                streak++;
                answer += streak;
            }
            else {
                diff = currDiff;
                streak = 0;
            }
        }
        return answer;
    }
}