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

// sort 0's, 1's and 2's
class Solution {
    public void sortColors(int[] a) {
        int high = a.length - 1;
        int low = 0;
        int mid = 0;
        while(high > mid){
            if(a[low] == 0){
                low++;
            }
            if(a[mid] <= 1 ){
                mid++;
            }
            if(a[high] == 2){
                high--;
            }
            if(a[low] > a[high] && high > low && a[low] == 2){
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
            }
            if(a[mid] > a[high] && high > mid && a[mid] == 2){
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
            }
            if(a[low] > a[mid] && mid > low && a[low] == 1){
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
            }
        }
    }
}
