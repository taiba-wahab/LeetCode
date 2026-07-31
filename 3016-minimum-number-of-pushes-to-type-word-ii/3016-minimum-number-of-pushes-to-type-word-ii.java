class Solution {
    public int minimumPushes(String word) {
        int answer = 0;
        int[] freq = new int[26];
        for(int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 97]++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) list.add(freq[i]);
        }
        Collections.sort(list, Collections.reverseOrder());
        int factor = 1;
        for(int i = 0; i < list.size(); i++) {
            if(i % 8 == 0 && i != 0) {
                factor++;
            }
            answer += list.get(i) * factor;
        }
        return answer;
    }
}