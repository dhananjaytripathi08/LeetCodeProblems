class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int temp1 = 0;
        String temp2 = "";
        for(int i=0;i<heights.length;i++) {
            for(int j=0;j<heights.length;j++) {
                if(heights[j] < heights[i]) {
                temp1 = heights[j];
                heights[j] = heights[i];
                heights[i] = temp1;
                temp2 = names[j];
                names[j] = names[i];
                names[i] = temp2;
            }
            }
        }
        return names;
    }
}