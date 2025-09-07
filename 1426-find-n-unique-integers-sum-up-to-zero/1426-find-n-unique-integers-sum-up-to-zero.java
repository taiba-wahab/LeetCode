class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int num = 1;
        for(int i = 0; i < n - 1; i += 2) {
            ans[i] = num;
            ans[i + 1] = -num;
            num++;
        }
        if((n & 1) == 1) {
            ans[n - 1] = 0;
        }
        return ans;
    }
}