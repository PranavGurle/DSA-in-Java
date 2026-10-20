//Q2 Given an array of marks of students, 
// if the mark of any student is less than 35 print
//its roll number. [roll number here refers to the index of the array.] 




package Arrays;
import java.util.*;
import java.util.Scanner;

public class Question2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        

        int marks[] = new int[size];
          // input
        for(int i = 0; i<size; i++){
            marks[i] = sc.nextInt();
        }
        // output
        for(int i =0; i<marks.length; i++){
            if(marks[i] < 35 ){
                System.out.println("roll number of the student marks<35: " + i);
            }
        }
        


    }
}
