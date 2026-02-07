package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
 Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;
        // arr[3]=4;
        // arr[4]=5;

        // input using for  loop
        // for(int i = 0 ;i < arr.length ; i++ ){
        //     arr[i] = in.nextInt();
        // }

        // for(int i = 0 ; i < arr.length ; i++){
        //     System.out.println("The elements are :  "+arr[i]);
        // }

        // for(int num : arr){ //for every element in array , print the element 
        //     System.out.println(num + " "); //here num represents element of the array
        // }
//array of objects
        String[] str = new String[4];
        for(int i = 0 ; i<str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
