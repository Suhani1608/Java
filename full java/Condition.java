import java.util.Scanner;

public class Condition{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = input.nextInt();

        if(salary > 10000){
            salary = salary + 2000;

        }
        else if (salary > 20000){
            salary = salary + 3000;
        }else{
            salary = salary +1000;
        }
        System.out.println("Increased salary is"+salary);
    }
}