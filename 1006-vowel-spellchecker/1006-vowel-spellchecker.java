class Solution {
    public String devowel(String s) {
        s = s.toLowerCase();
        int n = s.length();
        String devoweled = "";
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                devoweled += "*";
            }
            else {
                devoweled += ch;
            }
        }
        return devoweled;
    }
    public boolean caseInsensitive(String query, HashMap<String, String> caseCheck) {
        String lowerQuery = query.toLowerCase();
        if(caseCheck.containsKey(lowerQuery)) {
            return true;
        }
        return false;
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        HashSet<String> exact = new HashSet<>();
        for(int i = 0; i < wordlist.length; i++) {
            exact.add(wordlist[i]);
        }
        HashMap<String, String> caseCheck = new HashMap<>();
        for(String word : wordlist) {
            String lower = word.toLowerCase();
            caseCheck.putIfAbsent(lower, word);
        }
        HashMap<String, String> devoweledMap = new HashMap<>();
        for (String word : wordlist) {
            String key = devowel(word);
            devoweledMap.putIfAbsent(key, word); 
        }
        String[] result = new String[queries.length];
        for(int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if(exact.contains(query)) {
                result[i] = query;
            }
            else if(caseInsensitive(query, caseCheck)) {
                result[i] = caseCheck.get(query.toLowerCase());
            }
            else if(devoweledMap.containsKey(devowel(query))) {
                result[i] = devoweledMap.get(devowel(query));
            }
            else {
                result[i] = "";
            }
        }
        return result;
    }
}