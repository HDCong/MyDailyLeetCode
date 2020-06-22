class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int value=1; 
        int corner1 =0, corner2= n-1, corner3=n-1, corner4=0;
        while(value <=n*n){
            for(int i = corner4 ; i <= corner2;i++)
                result[corner1][i]= value++;
            corner1++;
            
            for(int i = corner1 ; i <= corner3;i++)
                result[i][corner2]= value++;
            corner2--;
            
            for(int i = corner2 ; i >=corner4;--i)
                result[corner3][i]= value++;
            corner3--;
            
            for(int i = corner3 ; i >= corner1;--i)
                result[i][corner4]= value++;
            corner4++;
        }
        return result;
    }
}