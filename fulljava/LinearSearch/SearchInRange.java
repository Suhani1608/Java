package LinearSearch;

public class SearchInRange {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,-7,-10,23,3,5,16};
        int target = 3;
        System.out.println(linearSearch(arr, target, 4, 7));

    }
    static int linearSearch(int[] arr , int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start ; i <= end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
