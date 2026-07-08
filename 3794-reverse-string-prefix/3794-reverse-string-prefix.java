class Solution {
    public String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public String reversePrefix(String s, int k) {
        String reversed = reverse(s.substring(0, k));
        return reversed + s.substring(k);
    }
}