package Recursion;

public class integerpallindrome {
    public static boolean isPallindrome(int n){
        return n == reverse( n , 0);
    }

public static int reverse(int n,int rev){
     if(n==0){
        return rev;
     }else{
        return reverse (n/10, rev*10+n%10);
     }
}
public static void main(String[] args){
    System.out.println(isPallindrome(13231));
}
}
