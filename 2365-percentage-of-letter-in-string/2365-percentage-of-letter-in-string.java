class Solution {
    public int percentageLetter(String s, char letter) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 97]++;
        }
        int n = s.length();
        return (int)((freq[letter - 97] * 100) / n);
    }
}