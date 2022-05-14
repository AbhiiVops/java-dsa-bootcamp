package com.abhii.conditiondsAndloops;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {

        // Q3. Print nth fibonacci Number:

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int p= 0;
        int i=1;

        for(int j=2;j<=n;j++){
            int sum = p+i;
            p=i;
            i=sum;
        }
        System.out.println("The nth fibonacci number is  " +i);





    }
}
