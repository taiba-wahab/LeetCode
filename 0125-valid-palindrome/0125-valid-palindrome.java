class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 48 && ch <= 57)) {
                sb.append(ch);
            }
        }
        int i = 0;
        int j = sb.length() - 1;
        while(i < j) {
            if(sb.charAt(i) != sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}