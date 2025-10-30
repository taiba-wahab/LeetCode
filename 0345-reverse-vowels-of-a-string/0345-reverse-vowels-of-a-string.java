class Solution {
    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        String vowels = "aeiou";
        return (vowels.indexOf(ch) != -1);
    }
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : array) {
            if(isVowel(ch)) {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : array) {
            if(isVowel(ch)) {
                sb.append(stack.pop());
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}