class Solution {
    public int shipWithinDays(int[] w, int D) {
        int low = w[getMax(w)];
        int high= getSum(w);
        
        int res=  low;
        while( low <= high ){
            int mid = low +(high-low)/2;
            if(checkDay(w,D,mid)){
                res= mid;
                high= mid -1;
            }else{
                low = mid +1;
            }
        }
        return res;
    }
    private boolean checkDay(int[] w, int D, int max){
        int cur = 0 ; 
        int day = 1;
        for(int i = 0 ; i < w.length;i++){
            if(cur+w[i]>max){
                cur = 0;
                day++;
            }
            cur+=w[i];
        }
        return day <=D;
    }
    private int getMax(int[] w){
        int max =0 ;
        for(int i = 1; i < w.length;i++)
            if(w[i]>w[max]) max=i;
        return max;
    }
    
    private int getSum(int[] w){
        int res =0 ;
        for(int i = 0; i < w.length;i++)
             res+=w[i];
        return res;
    }
}