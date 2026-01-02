class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        if(totalSum % 2 == 0) return nums.length - 1;
        return 0;
    }
}