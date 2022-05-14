package com.abhii;

public class Shadowing {
    static int x= 90;   // this will be shadowed at point 8
  //  static int y = 110;
    public static void main(String[] args) {
        System.out.println(x); // it gonna print 90
      int x = 40;   // now while initialising this upper x is overlapped by the scope of the main func.
                    // the class variable at line 4 is shadowed by this.
        System.out.println(x);  // it will print 40

//        int y;
//        System.out.println(y); // scope will begin when the value is initialised
//        y=990;

        fun();

    }

     static void fun() {
         System.out.println(x);  //  90
    }
}
