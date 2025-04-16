class Solution {
    public int countSymmetricIntegers(int low, int high) {
       int answer = 0;
       for(int i = low; i <= high; i++) {
        String temp = Integer.toString(i);
        int length = temp.length();
        String a = temp.substring(0, length/2);
        String b = temp.substring(length/2, length);
        int leftSum = 0, rightSum = 0;
        if(length % 2 == 0) {
        for(int j = 0; j < length/2; j++) {
            leftSum += temp.charAt(j) - '0';
            rightSum += temp.charAt(j + length/2) - '0';
        }
        if(leftSum == rightSum) {
            answer++;
            }
         }
       }
       return answer;
    }
}