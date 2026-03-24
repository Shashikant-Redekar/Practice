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
