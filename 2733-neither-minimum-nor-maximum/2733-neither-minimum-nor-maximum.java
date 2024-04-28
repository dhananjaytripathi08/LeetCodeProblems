class Solution {
    public int findNonMinOrMax(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        if(nums.length <= 2) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[mid];
    }
}