package JavaWithHoneyyy;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Kms");
        float km = sc.nextFloat();

        double miles = km * 0.621371;
        System.out.println("Distance in miles is: "+miles);




    }
}
