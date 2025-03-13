class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        int [] nums = new int [n];
        for(int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }
        for(int i = 0; i < n; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}