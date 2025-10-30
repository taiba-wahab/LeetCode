class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int empty = numBottles;
        while(empty >= numExchange) {
            sum += empty / numExchange;
            empty = (empty / numExchange) + (empty % numExchange);
        }
        return sum;
    }
}