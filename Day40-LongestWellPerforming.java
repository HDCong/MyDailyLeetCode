class Solution {
    public int longestWPI(int[] hours) {
        int n = hours.length;
        int []pfSum = new int[n];
        pfSum[0]=hours[0]>8? 1:-1;
        for(int i = 1 ;  i < n;i++)
            pfSum[i]=hours[i]>8? pfSum[i-1]+1:pfSum[i-1]-1;
        int res = 0 ; 
        for(int i = 0 ; i < n;i++)
        {
            for(int j = i; j < n ; j++){
                if(checkSum(pfSum,i ,j)>0){
                    res = Math.max(res, j-i+1);
                }
            }
        }
        return res;
        
    }
    private int checkSum(int[]sums, int i, int j ){
        return i>0? sums[j]-sums[i-1]: sums[j];
    }
}