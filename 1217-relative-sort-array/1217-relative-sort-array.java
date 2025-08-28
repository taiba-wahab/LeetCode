class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = Arrays.stream(arr1).max().getAsInt();
        int[] freq = new int [max + 1];
        for(int i = 0; i < arr1.length; i++) {
            freq[arr1[i]]++;
        }
        int[] answer = new int[arr1.length];
        int index = 0;
        for(int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            while(freq[num] > 0) {
                answer[index] = num;
                index++;
                freq[num]--;
            }
        }
        for(int i = 0; i < freq.length; i++) {
            while(freq[i] > 0) {
                answer[index] = i;
                freq[i]--;
                index++;
            }
        }
        return answer;
    }
}