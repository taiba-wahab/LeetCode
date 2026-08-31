class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        int left = 0, right = 0, count = 0;
        HashMap<Character, Integer> mapW = new HashMap<>();
        String answer = "";
        while(right < s.length()) {
            char ch = s.charAt(right);
            if(mapT.containsKey(ch)) {
                mapW.put(ch, mapW.getOrDefault(ch, 0) + 1);
                if(mapW.get(ch) <= mapT.get(ch)) count++;
            }
            while(count == t.length()) {
                answer = (answer != "" && (answer.length() < (right - left + 1))) ? answer : s.substring(left, right + 1);
                char leftChar = s.charAt(left);
                if(mapT.containsKey(leftChar)) {
                    if(mapW.get(leftChar) <= mapT.get(leftChar)) count--;
                    mapW.put(leftChar, mapW.get(leftChar) - 1);
                }
                left++;
            }
            right++;
        }
        return answer;
    }
}