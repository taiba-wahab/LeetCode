class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int maxLen = Integer.MIN_VALUE;
        int left = 0, right = 0, len = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            set.add(s.charAt(right));
            right++;
        }
        return maxLen;
    }
}