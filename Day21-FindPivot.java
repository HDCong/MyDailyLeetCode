class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, remain = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (remain == sum - remain - nums[i]) return i;
            remain += nums[i];
        }
        return -1;
    }
}