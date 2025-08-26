class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sTot = new HashMap<>();
        HashMap<Character, Character> tTos = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!(sTot.containsKey(c1))) {
                sTot.put(c1, c2);
            }
            else {
                if(sTot.get(c1) != c2) {
                    return false;
                }
            }
            if(!(tTos.containsKey(c2))) {
                tTos.put(c2, c1);
            }
            else {
                if(tTos.get(c2) != c1) {
                    return false;
                }
            }
        }
        return true;
    }
}