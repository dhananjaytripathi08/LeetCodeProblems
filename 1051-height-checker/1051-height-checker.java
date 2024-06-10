class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sortedHeight = heights.clone();
        Arrays.sort(sortedHeight);
        for(int i=0;i<heights.length;i++) {
            if(sortedHeight[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}