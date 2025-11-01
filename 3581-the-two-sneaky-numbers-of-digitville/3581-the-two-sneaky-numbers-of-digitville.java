class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int max = Arrays.stream(nums).max().getAsInt();
        int[] freq = new int[max + 1];
        for(int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        int k = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > 1) {
                ans[k] = i;
                k++;
            }
        }
        return ans;
    }
}