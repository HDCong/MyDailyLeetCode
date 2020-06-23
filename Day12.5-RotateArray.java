class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k%length;
        if(k==0 ) return;
        int []temp = new int[length];
        int i = 0;
        for( ; i < k;)
            temp[i]= nums[length-k+i++];
        for(int j = 0; j < length-k;)
            temp[i++]=nums[j++];
        for (i =0; i < length;++i){
            nums[i] = temp[i];
        }
    }
}