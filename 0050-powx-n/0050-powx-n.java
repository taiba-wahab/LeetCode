class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if(x == 1) {
            return x;
        }
        if(n == 0) {
            return 1.0;
        }
        if(N < 0) {
            N = -N;
            x = 1/x;
        }
        double result = power(x, N);
        return result;
    }
    public double power(double x, long n) {
        double answer = 1.0;
        if(n == 1) {
            return x;
        }
        double half = power(x, n/2);
        if(n % 2 == 1) answer = x;
        answer = answer * half * half;
        return answer;
    }
}