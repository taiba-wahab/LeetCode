class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, right = 0, ans = Integer.MIN_VALUE, maxFreq = Integer.MIN_VALUE;
        while(right < s.length()) {
            char ch = s.charAt(right);
            freq[ch - 65]++;
            maxFreq = Math.max(maxFreq, freq[ch - 65]);
            while((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 65]--;
                left++;
            }
            ans = Math.max(ans, (right - left + 1));
            right++;
        }
        return ans;
    }
}