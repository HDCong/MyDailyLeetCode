class Solution {
    public List<List<Integer>> generate(int numRows) {    
        List<List<Integer>> res= new ArrayList<>(numRows);
        if(numRows<1) return res;
        List<Integer> row1 = new ArrayList<Integer>();
        row1.add(1);
        res.add(row1);

        for(int i = 1;i<= numRows;++i){
            List<Integer> row = new ArrayList<Integer>();
            // Set default 
            row.add(1);
            for(int j = 1; j <i-1;j++){
                row.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
            }
            row.add(1);
            res.add(row);
        }
        res.remove(1);
        return res;
    }
}