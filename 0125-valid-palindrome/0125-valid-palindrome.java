class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(!(ch1 >= 'a' && ch1 <= 'z') && !(ch1 >= 48 && ch1 <= 57)) {
                i++;
                continue;
            }
            if(!(ch2 >= 'a' && ch2 <= 'z') && !(ch2 >= 48 && ch2 <= 57)) {
                j--;
                continue;
            }
            if(ch1 != ch2) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}