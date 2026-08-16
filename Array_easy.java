//Largest Element in array

  void largest(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
  }

//SecondLagest element in the array

class Solution {
    void secondLargest(int[] arr) {
        int max = arr[0];
        int smax = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                smax=max;
                max = arr[i];
            }
            if(smax < arr[i] && arr[i] < max)
                smax = arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}

//Check if an array is sorted

class Solution {
    void isSorted(int[] arr) {
        boolean sorted = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] > arr[i]){
                sorted = false;
            }
        }
        if(sorted)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}

//Left rotate array by 1

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    void isSorted(int[] arr) {
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = temp;
        for(int i: arr){
            System.out.println(i);
        }
    }
}

//Left rotate by k 

class Solution {
        int[] reverseArray(int[] nums,int start,int end){
          while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
          }
          return nums;
        }
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        nums = reverseArray(nums,k,n-1);
        nums = reverseArray(nums,0,k-1);
        nums = reverseArray(nums,0,n-1);
    }

  //move zeros to right
  class Solution{
    public void moveZeroes(int[] nums) {
        int count = 1;
        for(int i = 1; i< nums.length; i++){
            if(nums[i-1] == 0 && nums[i] != 0){
                nums[i - count] = nums[i];
                nums[i] = 0;
            } else if (nums[i-1] == 0 && nums[i] == 0){
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
}

//Merge sorted arrays
class Solution{
    public void UnionoOfSortedArrays(int[] arr1,int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length &&  j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || arr1[i] != union.get(union.size() - 1)) {
                    union.add(arr1[i]);
                }
                i++;
            } else if(arr1[i] > arr2[j]){
                if(union.isEmpty() || arr2[j] != union.get(union.size() - 1)) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if(union.isEmpty() || arr1[i] != union.get(union.size() - 1)) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i < arr1.length){
            if(arr1[i] != union.get(union.size() - 1)){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j < arr2.length){
            if(arr2[j] != union.get(union.size() -1)) {
                union.add(arr2[j]);
            }
            j++;
        }
        System.out.println(union);
    }
}
