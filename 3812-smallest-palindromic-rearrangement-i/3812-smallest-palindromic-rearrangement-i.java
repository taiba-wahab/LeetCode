class Solution {
    public String smallestPalindrome(String s) {
        int [] freq = new int [26];
        int size = s.length();
        char [] answer = new char [size];
        for(int i = 0; i < size; i++) {
            freq[s.charAt(i) - 97]++;
        }
        int low = 0;
        int high = size - 1;
        for(int i = 0; i  < 26; i++) {
            while(freq[i] > 1) {
                answer[low] = (char) (i + 97);
                answer[high] = (char) (i + 97);
                low++;
                high--;
                freq[i] -= 2;
            }
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] == 1) {
                answer[low] = (char) (i + 97);
            }
        }
        return String.valueOf(answer);
    }
}