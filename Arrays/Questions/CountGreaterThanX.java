// Q5 count the number of elements
//  in given array greater than a given number x. 




package Arrays;

public class CountGreaterThanX {


public static void main(String[] args) {
    

    int [] arr = {10, 25, 5, 40, 15};

    int count = 0;

    int x = 5;

    for(int i = 0; i< arr.length; i++){
        if(arr[i]>x){
            count++;
        }

    }System.out.println(count);
}

    
}
