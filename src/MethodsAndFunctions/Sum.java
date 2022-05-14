package MethodsAndFunctions;


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

       // sum();
        int sum = sum2();
        System.out.println(sum);
    }

//   static void sum() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter number 2: ");
//        int num2 = sc.nextInt();
//
//        int sum = num1+num2;
//        System.out.println("The sum is: "+ sum);



        static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

            return num1+num2;
           // System.out.println("rfj");  // After the return statement  the program gets executed so there is no point of
            // writing any statements after the return statement

    }
}
