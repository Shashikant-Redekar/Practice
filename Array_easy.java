//Largest Element in array

  void largest(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println(max);
  }
