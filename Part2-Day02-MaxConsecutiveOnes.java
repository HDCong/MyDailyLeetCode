
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count =0 ;
        for(int i = 0 ; i < nums.length;i++){
            if(nums[i]==0){
                if(count>max) max = count;
                count = 0;
            }
            else{
                count+=1;
            }
        }
        return max>count?max:count;
    }
}