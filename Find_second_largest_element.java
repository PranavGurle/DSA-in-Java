//Find the second largest element in the given array


package Arrays;

import java.util.Scanner;

public class Find_second_largest_element {


    public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();

    int arr[] = new int[size];

    //input
    for(int i =0; i<size; i++){
        arr[i] = sc.nextInt();

    }
      
    int max1 = arr[0];
    
    //output
    for(int i =0; i<arr.length; i++){
       if(arr[i]>max1){
         max1 = arr[i];
       }
    }




    int max2 = Integer.MIN_VALUE;

    //Find the second-largest distinct element

    for(int i =0; i<arr.length; i++){
        if(arr[i]<max1 && arr[i] > max2){
            
         max2 = arr[i];
        }
    }


       
    System.out.println("the maximum number is : "  + max1);

    if(max2 == Integer.MIN_VALUE){
        System.out.println("No second - largest distinct element exitst. ")
        ;
    }else{


    
    System.out.println("the secomd maximum number is : "  + max2);
    }
    sc.close();
}
}

