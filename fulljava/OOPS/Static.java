package OOPS;

public class Static {
   static int a =4;
   static int b;

   static{
    System.out.println("This is static block");
    b=a+6;
   }
   public static void main(String[] args) {
    Static obj=new Static();
    System.out.println(Static.a+Static.b);

    Static.b+=2;
    System.out.println(Static.a+Static.b);

    Static obj1=new Static();
        
    System.out.println(Static.a+Static.b);
   }
}
