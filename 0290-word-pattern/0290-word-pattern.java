class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> patternTowords = new HashMap<>();
        HashMap<String, Character> wordsTopattern = new HashMap<>();
        if(pattern.length() != words.length) return false;
        for(int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String c2 = words[i];
            if(!(patternTowords.containsKey(c1))) {
                patternTowords.put(c1, c2);
            }
            else {
                if(!patternTowords.get(c1).equals(c2)) {
                    return false;
                }
            }
            if(!(wordsTopattern.containsKey(c2))) {
                wordsTopattern.put(c2, c1);
            }
            else {
                if(!wordsTopattern.get(c2).equals(c1)) {
                    return false;
                }
            }
        }
        return true;
    }
}