package BinarySearch;

public class binarySearch {
    public static void main(String[] args){
         int[] num = {-18,-12,-4,0,1,4,16,18,32,89};
         int target = 18;
         int ans = binarySearch(num , target);
         System.out.println(ans);
    }
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if (target > arr[mid] ){
                start = mid+1;
            }else{ 
                return mid;

            }

        }
        return -1;
    }
}
