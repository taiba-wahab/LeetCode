class Solution {
    public boolean isThree(int n) {
        int count = 0;
        int x = (int) Math.sqrt(n);
        if(x * x == n) {
            for(int i = 1; i < (int) Math.sqrt(n); i++) {
                if(n % i == 0)
                count += 2;
            }
        }
        return count == 2;
    }
}