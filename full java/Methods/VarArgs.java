package Methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
        fun(2, 3, 34, 55, 675, 77);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
