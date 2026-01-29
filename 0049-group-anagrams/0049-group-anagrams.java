class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 97]++;
        }
        for(int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 97]--;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) {
            String s = strs[i];
            List<String> temp = new ArrayList<>();
            if(strs[i] == "") continue;
            temp.add(s);
            for(int j= i + 1; j < strs.length; j++) {
                if(strs[j] == "") continue;
                String t = strs[j];
                boolean check = (isAnagram(s, t));
                if(check) {
                    temp.add(t);
                    strs[j] = "";
                }
            }
            ans.add(temp);
        }
        return ans;    
    }
}