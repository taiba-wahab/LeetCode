class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, (s1, s2) -> {
            char c1 = s1.charAt(s1.length() - 1);
            char c2 = s2.charAt(s2.length() - 1);
            return c1 - c2;
        });
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i].substring(0, words[i].length() - 1);
            str.append(word);
            if(i != words.length - 1) str.append(" ");
        }
        return str.toString();
    }
}