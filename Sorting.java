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

//MERGE SORT
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Solution {
    void mergeSort (int[] arr,int low,int high){
        if(low >= high) return;
        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void merge (int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> temp= new ArrayList<>();

        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }
        while(left <= mid ){
            temp.add(arr[left++]);
        }
        while (right <= high){
            temp.add(arr[right++]);
        }
        for (int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = new int[]{1,7,5,6,4,3,2,9,8};
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        s.mergeSort(arr,0,arr.length-1);
        for( int i: arr){
            System.out.println(i);
        }
    }
}

