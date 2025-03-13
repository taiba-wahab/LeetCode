class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            int size = words[i].length();
            String temp = words[i];
            for(int j = 0; j < size; j++) {
                if(temp.charAt(j) == x) {
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}