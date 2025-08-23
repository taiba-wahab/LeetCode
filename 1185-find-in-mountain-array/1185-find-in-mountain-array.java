/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int binarySearch(MountainArray mountainArr, int target, int start, int end, boolean ascending) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = mountainArr.get(mid);
            if(ascending) {
                if(midVal == target) {
                    return mid;
                }
                else if(midVal > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(midVal == target) {
                    return mid;
                }
                else if(midVal < target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int low = 0;
        int high = mountainArr.length() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int value = mountainArr.get(mid);
            if (value < mountainArr.get(mid + 1)) {
                low = mid + 1;   
            } 
            else {
                high = mid;   
            }
        }
        return low;
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = binarySearch(mountainArr, target, 0, peak, true);
        if(firstTry != -1) {
            return firstTry;
        }
        else {
            return binarySearch(mountainArr, target, peak, mountainArr.length() - 1, false);
        }
    }
}