class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowelFreq = new HashMap<>();
        HashMap<Character, Integer> consonantFreq = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelFreq.put(ch, vowelFreq.getOrDefault(ch, 0) + 1);
            }
            else {
                consonantFreq.put(ch, consonantFreq.getOrDefault(ch, 0) + 1);
            }
        }
        int maxVowel = 0;
        for(int vowel : vowelFreq.values()) {
            maxVowel = Math.max(maxVowel, vowel);
        }
        int maxConsonant = 0;
        for(int consonant : consonantFreq.values()) {
            maxConsonant = Math.max(maxConsonant, consonant);
        }
        return maxVowel + maxConsonant;
    }
}