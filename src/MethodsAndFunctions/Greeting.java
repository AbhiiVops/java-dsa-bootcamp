package MethodsAndFunctions;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
       greeting();
    }
    static void greeting() {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Good morning "+name);
    }
}
