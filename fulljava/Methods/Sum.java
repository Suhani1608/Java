package Methods;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        sum();   // ✅ method call inside main
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no. :");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd no. :");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of two numbers is: " + sum);

        sc.close();
    }
}
