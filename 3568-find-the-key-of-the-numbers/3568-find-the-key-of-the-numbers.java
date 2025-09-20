class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int key = 0;
        int[] divisors = {1000, 100, 10, 1};
        for(int div : divisors) {
            int d1 = (num1 / div) % 10;
            int d2 = (num2 / div) % 10;
            int d3 = (num3 / div) % 10;
            int min = Math.min(d1, Math.min(d2, d3));
            key = key * 10 + min;
        }
        return key;
    }
}