class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] answer = new int [2];
        int c = 0;
        answer[0] = -1;
        answer[1] = -1;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    answer[c] = nums[i];
                    c++;
                }
            }
        }
        return answer;
    }
}