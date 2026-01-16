import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NO.");
        int a = input.nextInt();
        System.out.println("ENTER THE SECOND NO.");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum of FIRST NO. and SECOND NO. is :" + sum);
    }
}
