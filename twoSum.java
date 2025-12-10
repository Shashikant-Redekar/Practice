// Two Sum
// Solved 
// Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

// You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

// Return the answer with the smaller index first.

// Example 1:

// Input: 
// nums = [3,4,5,6], target = 7

// Output: [0,1]
// Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

// Example 2:

// Input: nums = [4,5,6], target = 10

// Output: [0,2]
// Example 3:

// Input: nums = [5,5], target = 10

// Output: [0,1]
// Constraints:

// 2 <= nums.length <= 1000
// -10,000,000 <= nums[i] <= 10,000,000
// -10,000,000 <= target <= 10,000,000
// Only one valid answer exists.


// Recommended Time & Space Complexity
// You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int[] output = new int[2];
        while (i < nums.length){
            int j = i+1;
            while(j < nums.length){
                if (target == (nums[i] + nums[j])){
                    output[0] = i;
                    output[1] = j;
                    break;
                }
                j++;
            }
            i++;
        }
        return output;
    }
}

//other solution using HashMap................................................................................................
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num= new HashMap();

        for (int i = 0; i < nums.length; i++){
            int c = target - nums[i];

            if(num.containsKey(c)){
                return new int[] { num.get(c), i };
            }
            num.put(nums[i], i);
        }
        return new int[0];
    }
}

