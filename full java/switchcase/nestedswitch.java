package switchcase;
import java.util.Scanner;
public class nestedswitch {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter employee id");
      int empId = sc.nextInt();
      String department = sc.next();

      switch(empId){
        case 1:
            System.out.println("India");
            
            break;
        case 2:
            System.out.println("US");
            break;
        case 3:
           
            switch(department){
                
                  

               case "a":
                System.out.println("CSE");
                break;
               case "b":
                System.out.println("AI/ML");
                break;
            }
            break;
        default:
            System.out.println("Enter correct  id");
      }
    }
}
