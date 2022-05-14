package com.abhii;

import java.util.Scanner;
import java.lang.Math;

public class Q1PrimeNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();


         if(n<=1) {
             System.out.println("Neither prime Nor composite");
         }
         int c =2;
         while(c<=Math.sqrt(n)) {
             if(n % c==0) {
                 System.out.println(" Not prime");
             }
             else {
                 System.out.println(" prime");
             }
             c++;
         }
    }
}
