package com.abhii.conditiondsAndloops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        // Q2. Case/type Check :

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().trim().charAt(0);   // -->

        if(ch >= 'a' && ch<= 'z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Upper Case");
        }


    }
}
