class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> patternToWords = new HashMap<>();
        HashMap<String, Character> wordsToPattern = new HashMap<>();
        if(pattern.length() != words.length) return false;
        for(int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String c2 = words[i];
            if(!patternToWords.containsKey(c1)) {
                patternToWords.put(c1, c2);
            }
            else {
                if(!patternToWords.get(c1).equals(c2)) return false;
            }
            if(!wordsToPattern.containsKey(c2)) {
                wordsToPattern.put(c2, c1);
            }
            else {
                if(!wordsToPattern.get(c2).equals(c1)) return false;
            }
        }
        return true;
    }
}