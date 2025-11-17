class Solution {
    public int getMaxLength(String s) {
        String[] words = s.split(" ");
        return words.length;
    }
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(int i = 0; i < sentences.length; i++) {
            int length = getMaxLength(sentences[i]);
            if(length > maxLength) maxLength = length;
        }
        return maxLength;
    }
}