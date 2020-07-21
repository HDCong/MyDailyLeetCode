class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits[n-1]==9){
            int i = n-1;
            while(i>=0 && digits[i]==9){
                digits[i]=0;
                i--;
            }
            if(i>=0){    
                digits[i]++;
                return digits;
            }
            else{
                int []newDigits = new int[n+1];
                newDigits[0]=1;
                return newDigits;
            }       
            
        }
        else{
            digits[n-1]++;
            return digits;
        }
    }
}