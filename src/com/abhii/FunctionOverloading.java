package com.abhii;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        // Imagine two functions of the same name
        // they can only exist if the parameters in them are different or
        //if the parameters are same then no. of parameters should be different


        fun(89);
        fun("Abhishek");

       // fun3(); // --> This will give error if no arguments are passed and is known as ambiguity:
              // It will not be able to decide the type in case of overloading

      //  fun3(); // if fun3() is not overloaded it will  not give any error
    }

    static void fun(int a ) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void fun3(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun3(String ...v) {
        System.out.println(Arrays.toString(v));
    }


}
