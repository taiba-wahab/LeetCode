class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> allowedSet = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++) allowedSet.add(allowed.charAt(i));
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean contains = true;
            for(int j = 0; j < word.length(); j++) {
                if(allowedSet.contains(word.charAt(j)) == false) {
                    contains = false;
                    break;
                }
            }
            if(contains) count++;
        }
        return count;
    }
}