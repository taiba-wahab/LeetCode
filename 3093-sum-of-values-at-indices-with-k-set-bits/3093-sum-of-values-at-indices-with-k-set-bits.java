class Solution {
    public int countSetBits(int num) {
        int count = 0;
        while(num != 0) {
            if((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(countSetBits(i) == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}