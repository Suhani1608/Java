package Recursion;

public class partion {
    public int maxsumafterpartioning(int[] arr, int k){

    
    int n = arr.length;
    int[] dp = new int[n+1];
    for(int i = n-1 ; i >= 0;i--){
        int maxval=0;
        int maxsum=0;
        for(int j =1;j<n && j<i+k;j++){
            maxval =Math.max(maxval,arr[j]);
            int len =j-i+1;
            maxsum=Math.max(maxsum,maxval*len+dp[j+1]);
        }
        dp[i] = maxsum;
    }
    return dp[0];
}
}
