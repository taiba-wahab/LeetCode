class Solution {
    public int findX(int n) {
        int num = 0;
        while(n != 0) {
            int rem = n % 10;
            if(rem != 0) {
                num = 10 * num + rem;
            }
            n /= 10;
        }
        return num;
    }
    public int reverse(int n) {
        int rev = 0;
        while(n != 0) {
            int rem = n % 10;
            rev = 10 * rev + rem;
            n /= 10;
        }
        return rev;
    }
    public int sum(int n) {
        int s = 0;
        while(n != 0) {
            int rem = n % 10;
            s += rem;
            n /= 10;
        }
        return s;
    }
    public long sumAndMultiply(int n) {
        if(n == 0) return 0;
        int revX = findX(n);
        int x = reverse(revX);
        int s = sum(x);
        return (long) x * s;
    }
}