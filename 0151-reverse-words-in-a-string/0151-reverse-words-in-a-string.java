class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String word = "";
        String result ="";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
            if (!word.isEmpty()) {
                 result = word + " " + result;
                word = "";
                }
            }
            else {
                word += ch;
            }
        }
        result = word + " " + result;
        return result.trim();
    }
}