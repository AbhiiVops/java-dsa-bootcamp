package JavaWithHoneyyy;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // kitkat, dairy milk roasted almonds, chocomoco, Amul dark chocolate

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String day = sc.nextLine();

        switch (day) {

            case "Monday" :
                System.out.println("I will eat kitkat");
                break;

            case "Tuesday" :
                System.out.println("I will eat Dairy milk roasted almonds");
                break;


            case "Wednesday" :
                System.out.println("I will eat chocomoco");
                break;


            case "Thursday" :
                System.out.println(" I will eat Amul dark chocolate");
                break;

            default:
                System.out.println("Mera mood ni hai aaj");
        }

    }
}
