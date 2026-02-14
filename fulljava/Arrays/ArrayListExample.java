package Arrays;
import java.util.Scanner;

import java.util.ArrayList;


public class ArrayListExample {
     //Syntax 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     ArrayList<Integer> List = new ArrayList<>(10);
    //  List.add(1);
    //  List.add(13);
    //  List.add(16);
    //  List.add(5);
    //  List.add(3);
    //  System.out.println(List);
    //  System.out.println(List.contains(2));
    //  List.set(0,23);
    //  List.remove(0);
    //  System.out.println(List);
    for (int i = 0 ;i<5;i++){
        List.add(sc.nextInt());
    }
    for(int i = 0;i<5;i++){
        System.out.println(List.get(i));//pass index here
    }
    System.out.println(List);
    }
}
