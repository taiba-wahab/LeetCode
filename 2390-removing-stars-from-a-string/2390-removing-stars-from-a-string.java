class Solution {
    public String removeStars(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()) {
            if(s.charAt(i) != '*') {
                sb.append(s.charAt(i));
                i++;
            }
            else {
                if(sb.length() == 0) i++;
                else {
                    sb.deleteCharAt(sb.length() - 1);
                    i++;
                }
            }
        }
        return sb.toString();
    }
}