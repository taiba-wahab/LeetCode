class Solution {
    public boolean isPalindrome(String x, int p, int q) {
        while(p < q) {
            if(x.charAt(p) != x.charAt(q)) {
                return false;
            }
            p++;
            q--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
}