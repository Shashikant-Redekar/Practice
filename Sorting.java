// SELECTION SORT
class Solution {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.println(i);
        }
}


// BUBBLE SORT

class Solution {
    void reverse(int[] arr) {
        for(int i = arr.length -1; i > 0; i--){
            int swap = 0;
            for (int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println("run");
                    swap = 1;
                }
            }
            if (swap == 0)
                break;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
