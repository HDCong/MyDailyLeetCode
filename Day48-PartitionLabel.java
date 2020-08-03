class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int[] charS = new int[26];
        for(int i = 0 ; i < S.length();i++)
            charS[S.charAt(i)-'a']= i;
        int currentEnd =0, end = 0;
        for(int i = 0 ; i < S.length();i++)
        {
            currentEnd = Math.max(currentEnd, charS[S.charAt(i)-'a']);
            if(currentEnd==i){
                res.add(currentEnd-end+1);
                end= currentEnd+1;
            }
        }
        return res;
    }
}