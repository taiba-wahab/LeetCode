class Solution {
    public int product(int n) {
        int pro = 1;
        while(n != 0) {
            int rem = n % 10;
            pro *= rem;
            n /= 10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        int temp = product(n);
        while(temp % t != 0) {
            temp = product(++n);
        }
        return n;
    }
}