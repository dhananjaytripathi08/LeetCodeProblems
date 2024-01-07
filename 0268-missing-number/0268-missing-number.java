class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = (length*(length+1))/2;
        for(int i=0;i<length;i++) {
            sum = sum - nums[i];
        }
        return sum;
    }
}