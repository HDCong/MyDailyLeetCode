class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] res=  new int[nums.length];
        int []value = new int[101];
        for(int i = 0 ; i < nums.length;++i)
            value[nums[i]]++;
        for(int i =1; i<= 100;++i){
            value[i]+= value[i-1];
        }
        for(int i = 0 ; i< nums.length;++i){
            if(nums[i]==0) res[i]=0;
            else{
                res[i]= value[nums[i] - 1];
            }
        }
        return res;
    }
    public int[] smallerNumbersThanCurrent2(int[] nums) {
        int [] res=  new int[nums.length];
        for(int i = 0 ; i < nums.length;++i){
            int count = 0 ;
            for(int j = 0;j<nums.length;++j){
                if(nums[i]>nums[j]&& i!=j) ++count;
            }
            res[i]=count;
        }
        return res;
    }
}