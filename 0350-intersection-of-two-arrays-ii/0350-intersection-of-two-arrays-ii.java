class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i=0;i<nums1.length;i++) {
            if(hm1.containsKey(nums1[i])) {
                hm1.put(nums1[i],hm1.get(nums1[i])+1);
            }
            else {
                hm1.put(nums1[i],1);
            }
        }
        for(int i=0;i<nums2.length;i++) {
            if(hm2.containsKey(nums2[i])) {
                hm2.put(nums2[i],hm2.get(nums2[i])+1);
            }
            else {
                hm2.put(nums2[i],1);
            }
        }
        for(Integer key:hm1.keySet()) {
            if(hm2.containsKey(key)) {
                int x = Math.min(hm1.get(key),hm2.get(key));
                while(x > 0) {
                    list.add(key);
                    x--;
                }
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}