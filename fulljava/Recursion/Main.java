package Recursion;

public class Main {

     public static void main(String[] args) {
        Count(10);
    }

    static void Count(int n) {

        if (n == 0) {
            return;
        }

        
        Count(n - 1);


        System.out.print(n + " ");
    }

   
}