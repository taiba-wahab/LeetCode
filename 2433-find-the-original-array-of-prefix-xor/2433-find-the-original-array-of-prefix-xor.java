class Solution {
    public int[] findArray(int[] pref) {
        int size = pref.length;
        int [] arr = new int[size];
        arr[0] = pref[0];
        for(int i = 1; i < size; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        return arr;
    }
}