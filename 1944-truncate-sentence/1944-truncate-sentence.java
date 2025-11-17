class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str = new StringBuilder();
        int wordCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                wordCount++;
                if(wordCount == k) break;
                str.append(s.charAt(i));
            }
            else {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}