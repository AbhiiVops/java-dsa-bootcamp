package com.abhii;

import java.util.Scanner;

public class ConditionsandLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Q: Print numbers from 1 to 5
//        for(int i =1;i<=5;i++) {
//            System.out.println(i);
//        }

        System.out.println("Enter a no.");
   //     int num = sc.nextInt();
//        for(int i =1;i<=num;i++) {
//            System.out.println(5+"*"+i+"="+5*i);
//        }

       // int i=1;
//        while(i<=num) {
//            System.out.println(i);
//            i++;
//        }\

//        while(true){
//            System.out.println("Hello Abhishek");
//        }

        int n=1;
        do {
            System.out.println(n);
            n++;
        } while(n<=5);

    }
}
