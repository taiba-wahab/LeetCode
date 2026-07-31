class Solution {
    public int minimumPushes(String word) {
        int answer = 0;
        int[] freq = new int[26];
        for(int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) list.add(freq[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        int pushCost = 1;
        for(int i = 0; i < list.size(); i++) {
            if(i % 8 == 0 && i != 0) {
                pushCost++;
            }
            answer += list.get(i) * pushCost;
        }
        return answer;
    }
}