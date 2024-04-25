class Solution {
    public int maximumCount(int[] nums) {
        int negative = 0;
        int positive = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != 0) {
                if(nums[i] < 0) {
                    negative++;
                }
                else {
                    positive++;
                }
            }
        }
        return Math.max(positive,negative);
    }
}