class Solution {
    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
    public static void cyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < nums.length && nums[correct] != nums[i]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
    }
    public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != ( i + 1)) {
                return (i + 1);
            }
        }
        return nums.length + 1;
    }
}