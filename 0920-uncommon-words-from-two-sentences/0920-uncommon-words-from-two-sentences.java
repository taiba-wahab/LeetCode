class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> ans = new ArrayList<>();
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : arr1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(String word : arr2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(String word : map.keySet()) {
            if(map.get(word) == 1) {
                ans.add(word);
            }
        }
        String[] result = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}