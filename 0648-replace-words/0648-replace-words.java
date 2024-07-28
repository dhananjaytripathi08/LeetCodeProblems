class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] str = sentence.split(" ");
        for(int i=0;i<dictionary.size();i++) {
            for(int j=0;j<str.length;j++) {
                if(str[j].startsWith(dictionary.get(i))) {
                    str[j] = dictionary.get(i);
                }
            }
        }
        String answer = "";
        for(String result : str) {
            answer = answer + result + " ";
        }
        return answer.trim();
    }
}