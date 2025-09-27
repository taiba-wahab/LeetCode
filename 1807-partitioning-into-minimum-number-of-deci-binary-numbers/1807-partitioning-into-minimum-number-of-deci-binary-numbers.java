class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if(ch - 48 > maxDigit) {
                maxDigit = ch - 48;
            }
        }
        return maxDigit;
    }
}