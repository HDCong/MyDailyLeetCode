class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max=arr[n-1], curmax = max;//'' = arr[n-1];
        
        for(int i = n -2 ; i >=0;--i){
            if(arr[i] > max) curmax = arr[i];
            arr[i] = max;
            if(max < curmax) max = curmax;
        }
        arr[n-1]=-1;
        return arr;
    }
}