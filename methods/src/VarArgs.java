//Variable length arguments.

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(42,82,291,292,29,2,3,4,5,292,3,2,23,56,89);
        multiple(24,42, "prashant", "pg codes","M");
    }

    static void fun(int ...v) {
        System.out.print(Arrays.toString(v));
    }

    static void multiple(int a , int b, String ...n) {

    }
}
