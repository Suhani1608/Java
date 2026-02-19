package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
            {23,45,67},
            {89,12,34,13},
            {56,78,90,56},
            {1,2,4},
        };
        int target = 56;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target){
        
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                if(arr[i][j] == target ){
                    return new int[]{i,j};

                }
            }
            
        }
        return null;
        
    }
}
