class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int[] values = new int[128];
        values['I'] = 1;
        values['V'] = 5;
        values['X'] = 10;
        values['L'] = 50;
        values['C'] = 100;
        values['D'] = 500;
        values['M'] = 1000;
        for(int i = 0; i < s.length() - 1; i++) {
            int curr = values[s.charAt(i)];
            int next = values[s.charAt(i + 1)];
            sum += curr < next ? -curr : curr;
        }
        return sum + values[s.charAt(s.length() - 1)];
    }
}