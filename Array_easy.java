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
