class Solution {
    public int maxProfit(int[] prices) {
        int val = 0; 
        for(int k=0;k<prices.length-1;++k){
            for(int j =k +1;j<prices.length;++j)
            {
                int r =prices[j]-prices[k];
                if(r>val)
                    val=r;
            }
        }
        return val;
        
    }
    public int maxProfit2(int [] prices){
                
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;

    }
    public int maxProfit3(int[] prices){
        int min = Integer.MAX_VALUE, max = 0;
        for (int price: prices) {
            min = Math.min(min, price);
            max = Math.max(price - min, max);
        }
        return max;

    }
}