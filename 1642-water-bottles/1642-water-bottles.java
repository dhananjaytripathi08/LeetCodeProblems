class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles >= numExchange) {
            int full = numBottles / numExchange;
            total = total + full;
            numBottles = numBottles % numExchange + full;
        }
        return total;
    }
}