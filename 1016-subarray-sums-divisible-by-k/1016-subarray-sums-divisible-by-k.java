class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int runningSum = 0;
        int count = 0;
        HashMap<Integer, Integer> remainderFreq = new HashMap<>();
        remainderFreq.put(0, 1);
        for(int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            int rem = runningSum % k;
            if(rem < 0) rem += k;
            count += remainderFreq.getOrDefault(rem, 0);
            remainderFreq.put(rem, remainderFreq.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}