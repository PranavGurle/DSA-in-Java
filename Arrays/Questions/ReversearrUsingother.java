//package Arrays;

/**
 * ReversearrUsingother
 * 
 */

import java.util.Arrays;


public class ReversearrUsingother {

    public static void main(String[] args) {
        
       
        int [] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

         int n = arr.length;

         int [] brr = new int[arr.length];


        for(int i = 0; i<n - 1; i++){

            brr[i] = arr[n - 1 - i];



        }System.out.println("reversed array:" + Arrays.toString(brr));




    }

    
}