class Solution {
    public int product(int n) {
        int temp = n;
        int pro = 1;
        while(temp != 0) {
            int rem = temp % 10;
            pro *= rem;
            temp /= 10;
        }
        return pro;
    }
    public int sumOfDigits(int n) {
        int temp = n, sum = 0;
        while(temp != 0) {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        return sum;
    }
    public boolean checkDivisibility(int n) {
        int pro = product(n);
        int sum = sumOfDigits(n);
        if(n % (pro + sum) == 0) return true;
        return false;
    }
}