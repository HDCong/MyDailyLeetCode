class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        int n = arr.length;
        int total = n;
        for(int i = 0 ; i<n;++i){
            for(int j = 0; j < n;++j){
                if(i!=j && arr[i][0]<= arr[j][0] && arr[i][1]>=arr[j][1]&&arr[j][0]<=arr[j][1])
                {
                    total -=1;
                    arr[j][0]=1;
                    arr[j][1]=0;
                }
            }
        }
        return total;
    }
}
