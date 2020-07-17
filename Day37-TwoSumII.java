class Solution {
    public int[] twoSum2(int[] numbers, int target) {
        int []res= new int[2];
        for(int i = 0 ; i < numbers.length-1;++i){
            int c=searchBinary(numbers,i+1,target-numbers[i]);
            if(c>i){
                res[0] =i+1;
                res[1]=c+1;
                return res;
            }
        }
        return res;
    }
    public int[] twoSum(int[] numbers, int target) {
        int []res= new int[2];
        int left =0 , right = numbers.length-1;
        while(left<=right){
            if(numbers[left]+numbers[right]==target){
                    res[0] =left+1;
                res[1]=right+1;
                return res;
            }else if(numbers[left]+numbers[right]>target ){
                right--;
            }else left++;
        }
        return res;
    }
    private int searchBinary(int[] numbers, int from,int target){
        int left =from, right = numbers.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(numbers[mid]==target) return mid;
            else if(numbers[mid]>target) right = mid -1;
            else left=mid+1;
        }
        return -1;
    }
}