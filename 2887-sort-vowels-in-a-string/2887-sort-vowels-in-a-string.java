class Solution {
    public String sortVowels(String s) {
        char[] vowels = new char[10];
        for(int i = 0; i < 10; i++) { //O(1)
            vowels[0] = 'A';
            vowels[1] = 'E';
            vowels[2] = 'I';
            vowels[3] = 'O';
            vowels[4] = 'U';
            vowels[5] = 'a';
            vowels[6] = 'e';
            vowels[7] = 'i';
            vowels[8] = 'o';
            vowels[9] = 'u';
        }
        ArrayList<Character> vowelsList = new ArrayList<>();
        int n = s.length();
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean found = new String(vowels).chars().anyMatch(c -> c== ch);
            if(found) {
                vowelsList.add(ch);
            }
        }
        Collections.sort(vowelsList);
        Set<Character> vowelSet = new HashSet<>(vowelsList);
        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(vowelSet.contains(ch)) {
                ans.append(vowelsList.get(idx));
                idx++;
            }
            else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}