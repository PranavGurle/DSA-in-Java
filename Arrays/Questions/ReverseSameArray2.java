package Arrays;

import java.util.Arrays;

public class ReverseSameArray2 {


  public static void print(int[] arr ){

        for(int i = 0; i<arr.length; i++){
            System.err.println(arr[i] + " ");
        
        System.out.println();
}}

  public static void main(String[] args) {
        
    int [] arr = { 2, 3, 5, 7, 11, 13, 17};

    int n = arr.length;
     

    for(int i = 0; i<n/2; i++){

        int temp = arr[i];
        arr[i] = arr[n -1 - i];
        arr[n -1 - i] = temp;
        
        }
     


       System.out.println(Arrays.toString(arr));



    }

}   


    

