import java.util.*;  

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> list = new HashMap();
        for (String word: words) {
            list.put(word, list.getOrDefault(word, 0) + 1);
        }
        List<String> res = new ArrayList(list.keySet());
        Collections.sort(res, (a, b) -> list.get(a).equals(list.get(b)) ?
                a.compareTo(b) : list.get(b) - list.get(a));
        return res.subList(0, k);
    }
}