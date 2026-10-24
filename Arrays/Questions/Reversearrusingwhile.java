package Arrays;

import java.util.Arrays;

public class Reversearrusingwhile {


  
public static void print(int[] arr ){

        for(int i = 0; i<arr.length; i++){
            System.err.print(arr[i] + " ");
        }
        
        System.out.println();
}
    public static void swap(int[] arr, int i, int j) {  // if we need more swaps for long term
                                                        // we can use this methods
           int temp = arr[i];                
            arr[i] = arr[j];
            arr[j] = temp;

        
    }
    
 

    
    public static void main(String[] args) {
        int[] arr = {2, 3, 56, 7, 9, 181, 13, 17};
        int n = arr.length;
        print(arr);
        int i = 0, j = n-1;
        while(i<j){
          swap(arr, i, j);
            i++;
            j--;

        }print(arr);








    }
}
