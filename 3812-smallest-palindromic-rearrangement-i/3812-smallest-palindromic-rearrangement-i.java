class Solution {
    public String smallestPalindrome(String s) {
        int [] character_array = new int [26];
        for(int i = 0; i < s.length(); i++) {
            character_array[s.charAt(i) - 97]++;
        }
        char [] list = new char [s.length()];
        int low = 0;
        int high = s.length() - 1;
        for(int i = 0; i < 26; i++) {
            while(character_array[i] > 1) {
                list[low] = (char) (i + 97);
                list[high] = (char) (i + 97);
                low++;
                high--;
                character_array[i] -= 2;
            }
        }
        for(int i = 0; i < 26; i++){
            if(character_array[i] == 1){
                list[low] = (char) (i + 97);
                low++;
            }
        }
        return String.valueOf(list);
    }
}
