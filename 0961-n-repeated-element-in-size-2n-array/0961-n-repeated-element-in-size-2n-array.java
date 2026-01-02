class Solution {
    public int repeatedNTimes(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] freq = new int[max + 1];
        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] == nums.length / 2) return i;
        }
        return -1;
    }
}