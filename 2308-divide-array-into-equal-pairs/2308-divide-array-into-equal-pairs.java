class Solution {
    public boolean divideArray(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int [] frequency = new int [max + 1];
        for(int i = 0; i < nums.length; i++) {
            frequency[nums[i]] += 1;
        }
        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] % 2 != 0)
            return false;
        }
        return true;
    }
}