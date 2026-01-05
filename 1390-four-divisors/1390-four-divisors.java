class Solution {
    public int countDivisors(int n) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                int d1 = i;
                int d2 = n / i;
                if(d1 == d2) {
                    count += 1;
                    sum += d1;
                }
                else {
                    count += 2;
                    sum += d1 + d2;
                }
            }
        }
        if(count == 4) return sum;
        return -1;
    }
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = countDivisors(nums[i]);
            if(sum != -1) {
                totalSum += sum;
            }
        }
        return totalSum;
    }
}