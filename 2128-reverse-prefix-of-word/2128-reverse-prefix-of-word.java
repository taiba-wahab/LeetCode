class Solution {
    public String reverseString(String str, int idx) {
        StringBuilder sb = new StringBuilder();
        for(int i = idx; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        for(int i = idx + 1; i < str.length(); i++) sb.append(str.charAt(i));
        return sb.toString();
    }
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        String reversed = reverseString(word, idx);
        return reversed;
    }
}