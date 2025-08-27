class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for(int i = 1; i < strs.length; i++) {
            String word = strs[i];
            int length = Math.min(ans.length(), word.length());
            int j = 0;
            while(j < length && ans.charAt(j) == word.charAt(j)) {
                j++;
            }
            ans = ans.substring(0, j);
        }
        return ans;
    }
}