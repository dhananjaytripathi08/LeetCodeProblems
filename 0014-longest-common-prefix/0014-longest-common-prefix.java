class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str = "";
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int length1 = str1.length();
        int length2 = str2.length();
        int index = 0;
        while((index < length1) && (index < length2)) {
            if(str1.charAt(index) == str2.charAt(index)) {
                index++;
            }
            else {
                break;
            }
        }
        if(index == 0) {
            return "";
        }
        return str1.substring(0,index);
    }
}