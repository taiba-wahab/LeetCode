class Solution {
    public int sumDivisors(int num) {
        int sum = 1;
        for(int i = 2; i * i < num; i++) {
            if(num % i == 0) {
                sum += i;
                if(i != num / i) sum += num / i;
            }
        }
        return sum;
    }
    public boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        int sum = sumDivisors(num);
        return sum == num;
    }
}