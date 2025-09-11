class Solution {
    public String sortVowels(String s) {
        String vowels = "AEIOUaeiou";
        int n = s.length();
        int[] freq = new int[128];
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1) {
                freq[ch]++;
            }
        }
        StringBuilder sortedVowels = new StringBuilder();
        for(int i = 0; i < 128; i++) {
            while(freq[i] > 0) {
                sortedVowels.append((char)i);
                freq[i]--;
            }
        }
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1) {
                ans.append(sortedVowels.charAt(idx));
                idx++;
            }
            else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}