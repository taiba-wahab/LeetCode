class Solution {
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int i = 0; 
        int j = array.length - 1;
        while(i < j) {
            if(isVowel(array[i]) && isVowel(array[j])) {
                char ch = array[i];
                array[i] = array[j];
                array[j] = ch;
                i++;
                j--;
            }
            else if((!(isVowel(array[i]))) && isVowel(array[j])) {
                i++;
            }
            else {
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < array.length; k++) {
            sb.append(array[k]);
        }
        return sb.toString();
    }
}