package com.abhii.conditiondsAndloops;

import java.util.Scanner;

public class ReverseOfANo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;

        while(num >0) {
            int rem = num %10;
            ans = ans*10+rem;
            num /=10;
        }
        System.out.println(ans);

    }
}
