class Solution {
    public void sortColors(int[] nums) {
        int [] counts= new int[3];
        for(int i = 0 ; i < nums.length;++i)
            counts[nums[i]]++;
        for (int i = 1; i < 3;++i)
            counts[i]+=counts[i-1];
        int j = 0 ;
        while(j<counts[0])
            nums[j++] = 0;
        while(j<counts[1])
            nums[j++] = 1;
        while(j<counts[2])
            nums[j++] = 2;
    }
}