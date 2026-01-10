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
    public int[] topKFrequent(int[] nums, int k) {
        HashSet<Integer> n = new HashSet();
        LinkedHashSet<Integer> out = new LinkedHashSet<>();
        if(nums.length <= 2){
            int[] output = new int[k];
            for(int i=0; i<k; i++){
                output[i] = nums[i];
            }
            return  output;
        }else{
            for (int i : nums) {
                if (!n.add(i)) {
                    if (out.size() < k) {
                        out.add(i);
                    } else {
                        break;
                    }
                }   
            }
            while(out.size() < k){
            int[] n1 = n.stream().mapToInt(Integer::intValue).toArray();
            out.add(n1[out.size()]);
            }
            int[] output = out.stream().mapToInt(Integer::intValue).toArray();
            return output;
        }
    }
}
