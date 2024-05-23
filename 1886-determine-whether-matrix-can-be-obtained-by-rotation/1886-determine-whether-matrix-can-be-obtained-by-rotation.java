class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;
        int size = mat.length;
        while(count < 5) {
            int tempcount = 0;
            for(int i=0;i<size;i++) {
                for(int j=0;j<size;j++) {
                    if(i < j) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[j][i];
                        mat[j][i] = temp;
                    }
                }
            }
            for(int i=0;i<size;i++) {
                for(int j=0;j<size/2;j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][size-1-j];
                    mat[i][size-1-j] = temp;
                }
            }
            for(int i=0;i<size;i++) {
                for(int j=0;j<size;j++) {
                    if(mat[i][j] == target[i][j]) {
                        tempcount++;
                    }
                }
            }
            if(tempcount == (mat.length*target.length)) {
                return true;
            }
            count++;
        }
        return false;
    }
}