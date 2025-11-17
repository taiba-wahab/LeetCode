class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            int count = 1;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == ' ') count++;
            }
            maxLength = Math.max(count, maxLength);
        }
        return maxLength;
    }
}