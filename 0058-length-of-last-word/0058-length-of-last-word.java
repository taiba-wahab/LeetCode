class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int idx = s.lastIndexOf(" ");
        int count = 0;
        while(++idx < s.length()) {
            count++;
        }
        return count;
    }
}