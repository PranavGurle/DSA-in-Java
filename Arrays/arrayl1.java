//package Arrays;

import java.util.*;
public class arrayl1 {
    
   public static void main(String[] args) {
    

    int[] marks = new int[3];
    //int marks[] = new int[3];   we can also write like this is also true

    //int marks[] = {97, 98, 95}; this is if we know exact variables
    // to store


    marks[0] = 97; //phy
    marks[1] = 98; // chem
    marks[2] = 95; //eng

    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    
    for(int i = 0; i<3; i++){
        System.out.println(marks[i]);

    }



   }



}
