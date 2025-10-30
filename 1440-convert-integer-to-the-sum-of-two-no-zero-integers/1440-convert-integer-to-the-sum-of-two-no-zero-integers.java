class Solution {
    public boolean noZero(int n) {
        int temp = n;
        while(temp != 0) {
            int rem = temp % 10;
            if(rem == 0) return false;
            temp /= 10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for(int i = 1; i <= n; i++) {
            if((i + (n - i) == n) && (noZero(i) && noZero(n - i))) {
                ans[0] = i;
                ans[1] = n - i;
                break;
            }
        }
        return ans;
    }
}