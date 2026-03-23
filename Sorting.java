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
    void sort(int[] arr) {
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

// BUBBLE SORT WITH RECURSION

class Solution {
    void sort(int[] arr, int n) {
        if (n == 1) return;
        int swap = 0;
        for(int j = 0; j < n -1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                System.out.println("run");
                swap = 1;
            }
            System.out.println("RUN");
        }
        if(swap == 0) return;
        sort(arr, n-1);
    }
}

// INSERSION SORT

class Solution {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
                System.out.println("run");
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

// INSERSION SORT USING RECURSION

class Solution {
    void sort(int[] arr, int n, int i) {
        if (n == i) return;
        int j = i;
        while ( j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        sort(arr,n,i+1);
    }
}
