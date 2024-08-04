class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> l = new ArrayList<>();
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++) {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
                l.add(a[i]);
            }
        }
        for(int i=0;i<a.length;i++) {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
                a[i]=l.remove(l.size()-1);
            }
        }     
        return new String(a);        
    }
}