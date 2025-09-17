class Solution {
    public void radixSort(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        for(int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(nums, exp);
        }
    }
    public void countingSort(int[] nums, int exp) {
        int n = nums.length;
        int[] count = new int[10];
        int[] output = new int[n];
        for(int i = 0; i < n; i++) {
            int digit = (nums[i] / exp) % 10;
            count[digit]++;
        }
        for(int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for(int i = n - 1; i >= 0; i--) {
            int digit = (nums[i] / exp) % 10;
            output[count[digit] - 1] = nums[i];
            count[digit]--;
        }
        for(int i = 0; i < n; i++) {
            nums[i] = output[i];
        }
    }
    public int maximumGap(int[] nums) {
        radixSort(nums);
        int maxGap = 0;
        for(int i = 1; i < nums.length; i++) {
            int gap = nums[i] - nums[i - 1];
            if(gap > maxGap) {
                maxGap = gap;
            }
        }
        return maxGap;
    }
}