class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int rem=  0 , idx = A.length-1, cur=0;
        int numb;
        while(K >0 && idx >=0){
            numb= K %10;
            K/=10;
            cur = A[idx]+numb+rem;
            if(cur>9) {
                A[idx--]= cur%10;
                rem =1;
            }
            else{
                A[idx--]= cur;
                rem =0;
            }
             numb=K%10;
        }
        while(rem>0 && idx >=0){
            cur = A[idx]+rem;
            if(cur>9){
                A[idx--]=0;
                rem =1;
            }
            else{
                A[idx--]=cur;
                rem=0;
            }
            // System.out.print(A[idx+1]);
        }
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        while(K>0){
            // System.out.println('s');
            // System.out.println(K);
            numb=K%10;
            numb+=rem;
            if(numb>9) {
                rem =1;
                numb=numb%10;
            }
            else rem = 0;
            list.add(0, numb);
            K/=10;    
        }
        
        if(rem>0) list.add(0,1);
        return list;
    }
}
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        int idx = A.length - 1, rem = 0;
        while (idx >= 0 || K > 0) {
            int val = K % 10;
            int sum;
            if (idx < 0) sum = val + rem;
            else sum = val + rem + A[idx];
            result.add(sum % 10);
            rem = sum / 10;
            K /= 10;
            idx--;
        }
        
        if (rem >0) result.add(rem);
        Collections.reverse(result);
        return result;
    }
}