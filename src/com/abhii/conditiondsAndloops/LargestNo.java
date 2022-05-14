package com.abhii.conditiondsAndloops;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {

        // Q. Find the largest of the 3 numbers :

        // Intuition: Consider any no. to be maximum to all then compare that value with
        // all other no. and no.>max  will be the new max...

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter 1st no.");
//        int a = sc.nextInt();
//        System.out.println("Enter  2nd no.");
//        int b = sc.nextInt();
//        System.out.println("Enter 3rd no.");
//        int c = sc.nextInt();

//        int max = a;
//
//        if (b > max) {
//            max =b ;
//        } else if (c > max) {
//            max=c;
//        }
//        System.out.println(max);
//    }

        // OR

        //  int max = Math.max(a,b); // This method directly  gives the max of the two no.
        //  int max1 = Math.max(c,Math.max(a,b));   // like this we can compare three no. too

        //OR

       // System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE); // like this : we can assume the max value to be
        // the minimum value of an integer and any no. greater than that will be the new max

    }
}
