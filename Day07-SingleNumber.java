class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> myTable = new HashMap<>();

        for (int i : nums) {
          myTable.put(i, myTable.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
          if (myTable.get(i) == 1) {
            return i;
          }
        }
        return 0;
    }
}