class Solution {
    public boolean searchMatrix2(int[][] matrix, int target) {
        int m = matrix.length-1;
        if(m<0) return false;
        int n = matrix[0].length-1;
        if(n<0) return false;
        for(int i = 0 ; i<=n;++i )
            if(matrix[0][i]<= target && matrix[m][i]>=target && binarySearch(matrix,i,target))
                return true;

        return false;
        
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length ==0 || matrix[0].length==0) return false;
        int row= 0 ,m = matrix.length, column = matrix[0].length-1;
        while(row<m && column>=0 ){
            if(matrix[row][column]==target) return true;
            else if(matrix[row][column]>target) --column
            else ++row
        }
        return false;
    }
    public boolean binarySearch(int[][]arr, int column, int target){
        int left = 0, right = arr.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid][column]==target) return true;
            else if(arr[mid][column]>target) right = mid-1;
            else left= mid+1;
        }
        return false;
    }
    
}