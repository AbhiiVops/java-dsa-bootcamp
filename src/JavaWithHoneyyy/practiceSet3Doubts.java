package JavaWithHoneyyy;

import java.util.Scanner;

public class practiceSet3Doubts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = sc.nextInt();

        if(year %4==0) {
            System.out.println("It is a leap year ");
        }
        else if (year %100 ==0) {
            System.out.println("Not a leap year ");
        }
        else if (year %400 ==0) {
            System.out.println("It is a leap year ");
        }
        else
            System.out.println("not  a leap year");




    }

}
