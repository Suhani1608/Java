package Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        
    
    /*
    1 2 3
    4 5 6
    7 8 9
    */
   Scanner sc = new Scanner (System.in);
  // int[][] arr = new int[3][];//specifying ror is necessary
//   or
    // int[][] arr = {
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}
    // };
    int[][] arr = new int[3][2];
    System.out.println(arr.length);//shows no of rows
    //input
    for(int row = 0;row<arr.length;row++){
        for(int col = 0 ; col<arr[row].length;col++){
            arr[row][col] = sc.nextInt();
        }
    }
    }

}
