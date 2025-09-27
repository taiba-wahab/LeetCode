class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            maxDigit = Math.max(ch - 48, maxDigit);
        }
        return maxDigit;
    }
}