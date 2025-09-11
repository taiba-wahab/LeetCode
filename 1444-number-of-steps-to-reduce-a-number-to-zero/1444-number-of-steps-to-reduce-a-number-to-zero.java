class Solution {
    public static int helper(int num, int steps) {
        if(num == 0) {
            return steps;
        }
        else  {
            if(num % 2 == 0) {
                return helper(num / 2, steps + 1);
            }
            else {
                return helper(num - 1, steps + 1);
            }
        }
    }
    public int numberOfSteps(int num) {
        return helper(num, 0);
        
    }
}