package BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args){
        int[] num = {89,32,18,16,4,1,0,-4,-12,-18};
        int target = 18;
        int ans = orderAgnosticsBS(num , target);
        System.out.println(ans);
    }
    static int orderAgnosticsBS(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
//find whether the array is sorted in ascending order or not
        boolean isAsc ;
        if(arr[start]<arr[end]){

            isAsc = true;

        }else{
            isAsc = false;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
