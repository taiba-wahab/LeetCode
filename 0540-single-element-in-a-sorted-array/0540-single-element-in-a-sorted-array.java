class Solution {
    public int singleNonDuplicate(int[] nums) {
        int size = nums.length;
        int answer = 0;
        for(int i = 0; i < size; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}