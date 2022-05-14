package com.abhii;

import java.util.Scanner;

public interface Q2ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum =0;

        while(n>0) {
           int c=n%10;
            sum += (c*c*c);

            n /=10;
        }
        System.out.println("The sum of the no. is "+ sum);
    }
    }
