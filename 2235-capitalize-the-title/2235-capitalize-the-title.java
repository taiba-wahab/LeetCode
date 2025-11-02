class Solution {
    public String capitalizeTitle(String title) {
        String[] array = title.split(" ");
        for(int i = 0; i < array.length; i++) {
            String word = array[i];
            if(word.length() > 2) {
                array[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            else {
                array[i] = word.toLowerCase();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if(i == array.length - 1) {
                sb.append(array[i]);
            }else {
                sb.append(array[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}