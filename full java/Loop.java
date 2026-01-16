import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Loop {
    public static void main(String[] args){
           /*print to num from 1 to 5 using for loop */
        //    for(int num = 1; num<=5;num++){
        //     System.out.println(num);
        //    }
        // print number from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int num = 1 ;num<=n;num++){
        //     System.out.print(num+" ");
        System.out.println("Hello");
        }
    }
}
