class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        int size = strs.length;
        HashMap <String, List<String>> anagrams = new HashMap<>();
        for(int i = 0; i < size; i++) {
            String currString = strs[i];
            char [] currArr = currString.toCharArray();
            Arrays.sort(currArr);
            String key = new String(currArr);
            if(anagrams.containsKey(key)) {
                List<String> keyList = anagrams.get(key);
                keyList.add(currString);
            }
            else {
                List<String> newKeyList = new ArrayList<>();
                newKeyList.add(currString);
                anagrams.put(key, newKeyList);
            }
        }
        for(String key : anagrams.keySet()) {
            List<String> list = anagrams.get(key);
            answer.add(list);
        }
        return answer;
    }
}