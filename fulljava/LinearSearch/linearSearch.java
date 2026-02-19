package LinearSearch;

public class Linearsearch {
    public static void main(String[] args){
        int[] nums = {23,45,67,89,12,34};
        int target = 67;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0 ; i<arr.length;i++){
            int element = arr[i];
            if(element == target ){
                return i;
            }
       }
       
       
       return -1;
    }
}
