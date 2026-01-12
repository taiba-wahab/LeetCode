class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        HashMap<String, Integer> map =  new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length() == 0) continue;
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        HashSet<String> bannedSet = new HashSet<>();
        for(int i = 0; i < banned.length; i++) {
            bannedSet.add(banned[i].toLowerCase());
        }
        String common = "";
        int commonFreq = 0;
        for(String key : map.keySet()) {
            if(map.get(key) > commonFreq && bannedSet.contains(key) == false) {
                commonFreq = map.get(key);
                common = key;
            }
        }
        return common;
    }
}