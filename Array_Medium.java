//Two SUM
class Solution {
    public int[] twoSum(int[] a, int sum) {
        HashMap<Integer,Integer> b = new HashMap<>();
        for (int i = 0; i< a.length; i++){
            int target = sum - a[i];
            if(b.containsKey(target)){
                return new int[] {b.get(target),i};
            }
            b.put(a[i],i);
        }
        return new int[] {-1,-1};
    }
}
