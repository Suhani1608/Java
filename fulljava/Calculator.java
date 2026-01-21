import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter operator (+, -, *, /, %, x to exit): ");
            char op = in.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') ans = num1 + num2;
                else if (op == '-') ans = num1 - num2;
                else if (op == '*') ans = num1 * num2;
                else if (op == '/') ans = num1 / num2;
                else if (op == '%') ans = num1 % num2;

                System.out.println("Answer = " + ans);
            } else {
                System.out.println("Invalid operator!");
            }
        }
    }
}
