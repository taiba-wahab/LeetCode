class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int degree = 26;
        int degreeSum = 0;
        for(char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, degree);
            degree--;
        }
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            degreeSum += map.get(ch) * (i + 1);
        }
        return degreeSum;
    }
}