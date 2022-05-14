package MethodsAndFunctions;

public class SwapNo {

    public static void main(String[] args) {

        // Q. Swap two numbers:

        int a = 20;
        int b =30;

        // Swap code:
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
  //      System.out.println(a+ " "+b);

         swap(a,b);
        System.out.println(a+ " "+b);


        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);

    }

    // Understanding the nature of changing of the value upon calling the function:

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only.
        // The original value will not get changed.
        // Because num1 and a are pointing towards the same value of 20 and
        //         num2 and b are pointing towards the same value of 30.
        // further on swap num1 and num2 gets interchanged but the original value remains unchanged
    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object (we are not changing the original value)
    }


}
