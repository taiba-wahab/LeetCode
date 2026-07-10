class Solution {
    public int getMaximum(int n) {
        int max = Integer.MIN_VALUE;
        while(n != 0) {
            int rem = n % 10;
            max = Math.max(rem, max);
            n /= 10;
        }
        return max;
    }

    public int digitFrequencyScore(int n) {
        int max = getMaximum(n);
        int[] freq = new int[max + 1];
        int temp = n;
        int sum = 0;
        while(n != 0) {
            int rem = n % 10;
            freq[rem]++;
            n /= 10;
        }
        for(int i = 0; i < freq.length; i++) {
            sum += i * freq[i];
        }
        return sum;
    }
}