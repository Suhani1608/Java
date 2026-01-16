package switchcase;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favourite fruit name");
        String fruit = sc.next();

        switch(fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("An apple a day keeps away from doctor.");
                break;
            case "Banana":
                System.out.println("Banana is rich in protein.");
                break;
            default:
                System.out.println("is a fruit");

        }

    }
    
}
