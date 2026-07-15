class Solution {
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int evenSum = n * (n + 1);
        int oddSum = n * n;
        return gcd(oddSum, evenSum);
    }
}