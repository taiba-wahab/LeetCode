class Solution {
    public int linearSearch(int[] nums, int key) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == key) return i;
        }
        return -1;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k != 0) {
            int min = Arrays.stream(nums).min().getAsInt();
            int idx = linearSearch(nums, min);
            nums[idx] *= multiplier;
            k--;
        }
        return nums;
    }
}