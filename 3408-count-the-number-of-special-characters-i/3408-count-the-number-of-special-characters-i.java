class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        int[] freq = new int[256];
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq[ch]++; 
        }
        for(int i = 97; i < 123; i++) {
            if(freq[i] != 0 && freq[i - 32] != 0) {
                count++;
            }
        }
        return count;
    }
}