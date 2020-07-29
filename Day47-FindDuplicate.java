class Solution {
    public int findDuplicate(int[] nums) {
        int left =0 , right = nums.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(check(nums,mid))
                right  = mid;
            else left= mid+1;
        }
        return left;
    }
    private boolean check(int []nums, int mid )
    {
        int count = 0; 
        for(int val: nums){
            if(val<= mid) count++;
        }
        return count > mid;
    }
}