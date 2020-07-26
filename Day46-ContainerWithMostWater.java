class Solution {
    public int maxArea(int[] h) {
        int res= 0 , left= 0, right = h.length-1;
        while(left<right){
            res = Math.max(res,Math.min(h[left],h[right])*(right-left));
            if(h[left]< h[right]) left++;
            else right--;
        }
        return res;
    }
}