class Solution {
    public int reverse(int n) {
        int rev = 0;
        while(n != 0) {
            int rem = n % 10;
            rev = 10 * rev + rem;
            n /= 10;
        }
        return rev;
    }
    public int countNicePairs(int[] nums) {
        long count = 0;
        int MOD = 1000000007;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] - reverse(nums[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                count += map.get(nums[i]);
                count %= MOD;
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        return (int) count;
    }
}