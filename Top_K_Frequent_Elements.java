// Given an integer array nums and an integer k, return the k most frequent elements within the array.

// The test cases are generated such that the answer is always unique.

// You may return the output in any order.

// Example 1:

// Input: nums = [1,2,2,3,3,3], k = 2

// Output: [2,3]
// Example 2:

// Input: nums = [7,7], k = 1

// Output: [7]
// Constraints:

// 1 <= nums.length <= 10^4.
// -1000 <= nums[i] <= 1000
// 1 <= k <= number of distinct elements in nums.

class Solution {
    public int[] topKFrequent(int[] num, int k) {
        HashMap<Integer,Integer> n = new HashMap<>();
        for( int i: num){
            if(n.containsKey(i)){
                n.put(i, n.get(i)+1);
            }else{
                n.put(i,1);
            }
        }
        n = n.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(
                        LinkedHashMap::new,
                        (m, e) -> m.put(e.getKey(), e.getValue()),
                        LinkedHashMap::putAll
                );
        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer,Integer> en: n.entrySet()){
            if(en.getValue() > 1 && result.size() < k)
                result.add(en.getKey());
        }
        for(Map.Entry<Integer,Integer> en: n.entrySet()){
            if(en.getValue() == 1 && result.size() < k)
                result.add(en.getKey());
        }
        
        int[] nk = new int[k];
        for(int i = 0; i< result.size(); i++){
            nk[i] = result.get(i);
        }
        return nk;
    }
}
