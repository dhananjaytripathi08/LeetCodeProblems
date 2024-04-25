class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                }
            }
        }
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}