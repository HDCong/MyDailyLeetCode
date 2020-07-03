class Solution {
    public int findLucky(int[] arr) {
        int []count = new int[501];
        for(int i = 0 ; i < arr.length;++i){
            count[arr[i]]++;
        }
        for(int i = 500 ; i >= 1;--i){
            if(i==count[i]) return i;
        }
        return -1;
    }
}
class Solution {
        public int findLucky(int[] arr) {
            int []count = new int[501];
            int max = 0 ;
            for(int i = 0 ; i < arr.length;++i){
                count[arr[i]]++;
                if(arr[i]>max) max = arr[i];
            }
            for(int i = max ; i > 0;--i){
                if(i==count[i]) return i;
            }
            return -1;
        }
    }