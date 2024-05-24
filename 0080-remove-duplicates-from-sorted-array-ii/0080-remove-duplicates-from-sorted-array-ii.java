class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        if(nums.length < 3) {
            return nums.length;
        }
        for(int i=0;i<nums.length-2;i++) {
            if(nums[i] != nums[i+2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        nums[k] = nums[nums.length-2];
        nums[++k] = nums[nums.length-1];
        return k+1;
    }
}