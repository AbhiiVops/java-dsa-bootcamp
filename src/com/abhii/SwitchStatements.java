package com.abhii;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String1 fruit = sc.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("king of the fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Smaller Fruit");
//                break;
//            default :
//                System.out.println("Please enter a valid fruit");
//        }

        // Enhanced Switch Statement :

//        switch (fruit) {
//            case "Mango" -> System.out.println("king of the fruit");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Smaller Fruit");
//            default -> System.out.println("Please enter a valid fruit");
//        }

        System.out.println("Enter a no. b/w 1-7");
        int day = sc.nextInt();
//        switch(day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");


//            switch(day) {
//                case 1 :
//                case 2 :
//                case 3 :
//                case 4 : System.out.println("Weekday");
//                break;
//                case 5 :
//                case 6 :
//                case 7 : System.out.println("Weekend");
//                break;

        // Enhanced switch case of the above :
        switch (day) {
            case 1, 2, 3, 4 -> System.out.println("Weekday");
            case 5, 6, 7 -> System.out.println("Weekend");
        }
    }
}
