package com.abhii;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();

//        switch (empId) {
//            case 1:
//                System.out.println("Abhishek bhattacharjee");
//                break;
//            case 2:
//                System.out.println("Rishabh Singh");
//                break;
//            case 3:
//                System.out.println("Aditya Narayan Tiwari");
//                break;
//            case 4:
//                System.out.println("Dhruv Adavakar");
//                break;
//            case 5:
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department ");
//                        break;
//                    default:
//                        System.out.println("No Department");
//                }
//                break;
//            default:
//                System.out.println("You have entered an invalid empID");

 //   }



                // Writing this program in an enhanced way :

        switch (empId) {
            case 1 -> System.out.println("Abhishek bhattacharjee");
            case 2 -> System.out.println("Rishabh Singh");
            case 3 -> System.out.println("Aditya Narayan Tiwari");
            case 4 -> System.out.println("Dhruv Adavakar");
            case 5 -> {
                System.out.println("EMPLOYMENT NO. 5");   // This statement is not necessary to write while making the problem
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department ");
                    default -> System.out.println("No Department");
                }
            }
            default -> System.out.println("You have entered an invalid empID");
        }
    }
}
