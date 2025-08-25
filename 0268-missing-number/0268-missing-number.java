class Solution {
    public void swap(int[] nums, int correct, int i) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
    public void cyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
    }
    public int missingNumber(int[] nums) {
        cyclicSort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}