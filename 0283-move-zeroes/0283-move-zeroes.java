class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int [] temp = new int [nums.length];
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}