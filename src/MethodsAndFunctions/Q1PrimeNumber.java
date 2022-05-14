package MethodsAndFunctions;

import java.util.Scanner;

public class Q1PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n ) {
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c<=Math.sqrt(n)) {

            if(n % c==0) {
               return false;
            }
            c++;
        }
        return c>Math.sqrt(n);
     }
}
