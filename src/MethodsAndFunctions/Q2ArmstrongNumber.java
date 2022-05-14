package MethodsAndFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class Q2ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //   int  n= sc.nextInt();

     //   System.out.println(isArmstrong(n));

        // This for loop is created to know all the three digit armstrong nos
        for(int i=100;i<1000;i++) {
            if(isArmstrong(i)) {

                System.out.println(i);
            }
        }

    }

    static boolean isArmstrong(int n ) {
        int original = n;
         int sum =0;
        while(n>0) {
            int rem =n%10;
            sum += (rem*rem*rem);

            n /=10;
        }
        return sum == original;
    }
}
