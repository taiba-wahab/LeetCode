class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int empty = numBottles;
        int full = 0;
        int drunk = numBottles;
        while(empty >= numExchange) {
            empty -= numExchange;
            drunk++;
            empty++;
            numExchange++;
        }
        return drunk;
    }
}