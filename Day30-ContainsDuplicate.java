class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> st = new HashMap<Integer, Boolean> ();
        for(int i = 0 ; i < nums.length;++i){
            if(!st.containsKey(nums[i])){
                st.put(nums[i], true);
            }
            else return true;
        }
        return false;

    }
    
}