class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i = 0; i < s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if(map.get(ch1) < map.get(ch2)) {
                sum -= map.get(ch1);
            }
            else {
                sum += map.get(ch1);
            }
        }
        sum += map.get(s.charAt(s.length() - 1)); // for last character
        return sum;
    }
}