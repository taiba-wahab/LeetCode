class Solution {
    public long getBucketId(long num, long width) {
        return num < 0 ? ((num + 1L) / width) - 1L : num / width;
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if(valueDiff < 0) return false;
        HashMap<Long, Long> buckets = new HashMap<>();
        long width = (long) valueDiff + 1;
        for(int i = 0; i < nums.length; i++) {
            long num = nums[i];
            long bucketId = getBucketId(num, width);
            if(buckets.containsKey(bucketId)) return true;
            if(buckets.containsKey(bucketId - 1) && Math.abs(num - buckets.get(bucketId - 1)) < width) return true;
            if(buckets.containsKey(bucketId + 1) && Math.abs(num - buckets.get(bucketId + 1)) < width) return true;
            buckets.put(bucketId, num);
            if(i >= indexDiff) {
                long oldBucketId = getBucketId(nums[i - indexDiff], width);
                buckets.remove(oldBucketId);
            }
        }
        return false;
    }
}