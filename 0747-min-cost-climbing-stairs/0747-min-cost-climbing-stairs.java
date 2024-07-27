class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int next1 = cost[0];
        int next2 = cost[1];
        if(cost.length <= 2) {
            return Math.min(next1,next2);
        }
        for(int i=2;i<cost.length;i++) {
            int current = cost[i] + Math.min(next1,next2);
            next1 = next2;
            next2 = current;
        }
        return Math.min(next1,next2);
    }
}