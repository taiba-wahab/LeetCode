class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int maxLen = Integer.MIN_VALUE;
        int left = 0, right = 0, len = 0;
        HashSet<Character> set = new HashSet<>();
        while(right < s.length()) {
            if(!set.contains(s.charAt(right))) {
                len = right - left + 1;
                maxLen = Math.max(len, maxLen);
                set.add(s.charAt(right));
                right++;
            }
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}