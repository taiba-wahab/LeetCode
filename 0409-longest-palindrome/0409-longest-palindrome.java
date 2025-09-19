class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        int[] frequency = new int[52]; 
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                frequency[ch - 97]++;
            }
            else {
                frequency[ch - 65 + 26]++;
            }
        }
        boolean hasOdd = false;
        for(int f : frequency) {
            length += (f / 2) * 2;
            if(f % 2 == 1) {
                hasOdd = true;
            }
        }
        if(hasOdd) length++;
        return length;
    }
}