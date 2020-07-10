class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2) return nums.length;
        int idx = 1,val = nums[0], count=1;
        for(int j = 1;j<nums.length;++j){
            if(nums[j]!=val){
                val = nums[j];
                nums[idx++]= val;
                count++;
            }
        }
        return count;
    }
}