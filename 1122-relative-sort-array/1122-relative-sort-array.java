class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr2.length;i++) {
            for(int j=0;j<arr1.length;j++) {
                if(arr2[i] == arr1[j]) {
                    list.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++) {
            if(arr1[i] != -1) {
                list.add(arr1[i]);
            }
        }
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = list.get(i);
        }
        return arr1;
    }
}