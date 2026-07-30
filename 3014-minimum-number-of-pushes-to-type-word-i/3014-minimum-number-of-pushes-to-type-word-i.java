class Solution {
    public int minimumPushes(String word) {
        int rounds = word.length() / 8;
        int i = 1;
        int answer = 0;
        if(word.length() % 8 != 0) {
            answer = answer + ((rounds + 1) * (word.length() % 8));
        }
        while(rounds != 0) {
            answer += 8 * i;
            i++;
            rounds--;
        } 
        
        return answer;
    }
}