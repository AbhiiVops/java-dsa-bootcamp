package MethodsAndFunctions;

public class MethodsWithArguments {
    public static void main(String[] args) {

//        String1 myMessage = Greeting("Abhishek");
//        System.out.println(myMessage);

        //in the function main()
        //the variable x and y are the arguments

        // And

        // in the method multiply()
        //the variable a and b the parameters

        // ---> Arguments are Real <---
        int x = 2;
        int y = 5;

        int sum = multiply(x, y);

        System.out.println("SUM IS: " + sum);

    }

//    static String1 Greeting(String1 name) {
//        String1 message = "Hello " + name;
//        return message;
//    }

       // A Question to understand the difference between arguments and parameters
        public static int multiply(int a, int b)
        {
            return a + b;
        }






}
