package com.abhii;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // When we have no idea about the no. of arguments passed then
        // we used the concepts of VarArgs

        fun(1, 2, 3, 4, 4, 54, 5);
        fun1(1, 2, 3, 4, 5, 65, 7);
    }

    static void fun(int... x) {
        System.out.println(Arrays.toString(x));
    }

    static void fun1(int x, int... y) {   // in this type it is mandatory to give one no. atleast
        // y is implicitly declared


        System.out.println(x + " " + Arrays.toString(y));
    }

//    static void fun2(int x,int ...y,int z)  {  // --> this is wrong way of passing arguments
    // VarArgs should always come at the end
//}

}
