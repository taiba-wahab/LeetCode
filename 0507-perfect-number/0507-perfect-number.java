class Solution {
    public int sumDivisors(int num) {
        int sum = 0;
        for(int i = 1; i * i < num; i++) {
            if(num % i == 0) {
                int d1 = i;
                System.out.println(d1);
                int d2 = num / i;
                System.out.println(d2);
                sum += d1 + d2;
            }
        }
        return sum - num;
    }
    public boolean checkPerfectNumber(int num) {
        int sum = sumDivisors(num);
        return sum == num;
    }
}