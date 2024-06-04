class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(hm.containsKey(ch)) {
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        int ans = 0;
        boolean first = false;
        for(Character key : hm.keySet()) {
            if(hm.get(key)%2 == 0) {
                ans = ans + hm.get(key);
            }
            else {
                if(first == false) {
                    ans = ans + hm.get(key);
                    first = true;
                }
                else {
                    ans = ans + hm.get(key)-1;
                }
            }
        }
        return ans;
    }
}