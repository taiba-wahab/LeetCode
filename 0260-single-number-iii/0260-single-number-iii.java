class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int mask = xor & -xor;
        int[] result = new int[2];
        for(int num : nums) {
            if((num & mask) == 0) {
                result[0] ^= num;
            }
            else {
                result[1] ^= num;
            }
        }
        return result;
    }
}