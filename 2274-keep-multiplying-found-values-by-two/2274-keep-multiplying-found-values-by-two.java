class Solution {
    public int linearSearch(int[] nums, int key) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public int findFinalValue(int[] nums, int original) {
        int index = linearSearch(nums, original);
        while(index != -1) {
            original = nums[index] * 2;
            index = linearSearch(nums, original);
        }
        return original;
    }
}