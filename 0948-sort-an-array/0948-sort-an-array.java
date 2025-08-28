class Solution {
    public void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums, start, mid, end);
        }
    }

    public void merge(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = start, j = mid + 1;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }
        for (int idx = 0; idx < temp.size(); idx++) {
            arr[start + idx] = temp.get(idx);
        }
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}
