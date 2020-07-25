class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int upper = piles[findMax(piles)];
        int low = 1;
        while(low <= upper){
            int mid = low + (upper - low )/2;
            if(check(piles,H,mid))
                upper= mid-1;
            else low = mid+1;
        }
        return low;
    }
    private boolean check(int []piles, int H, int mid ){
        int count =0;
        for(int pile: piles ){
            if(pile%mid==0)
                count+=pile/mid;
            else count+=pile/mid+1;
        }
        return count<=H;
    }
    private int findMax(int[] piles){
        int res =0 ; 
        for(int i =1 ; i < piles.length;i++)
            if(piles[i]>piles[res]) res= i;
        return res; 
    }
}