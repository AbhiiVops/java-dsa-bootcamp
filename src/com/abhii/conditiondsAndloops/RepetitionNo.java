package com.abhii.conditiondsAndloops;

import java.util.Scanner;

public class RepetitionNo {
    public static void main(String[] args) {

        // RepetitionNo. Count the repetition of given number given as input:

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int count =0;

        while(n>0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
