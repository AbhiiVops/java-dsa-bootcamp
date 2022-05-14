package Strings;

public class String1 {
    public static void main(String[] args) {

        int a =10;
        int[] arr = {2,3,4,5,6}; // --> we have already covered that reference variable
                                 // arr is in the stack memory and the object of that ref
                                 // variable is in the heap memory
        // ** any change made via arr will result in change of the main object...(this is the concept of the array)

        String name = "Abhishek Bhattacharjee";
        System.out.println(name);

        // Now suppose:
        String b = "Abhishek";
        String c = "Abhishek";

        // Now there might be a question that do b and c are pointing to the two diff objects
        // or to the same objects --> for that two concepts need to be understood -:

        // 1. String1 pool --> it is separate memory structure in the heap memory
        // 2. immutability

        // * String1 pool
        // --> All the similar values of string is not recreated in the pool.
        // --> Use Case : it makes our program more optimised and faster.

        // Now there can be other doubt that when both the ref variable are pointing to
        // the same object then change in one of the ref variable will lead to the
        // change in the other ref variable value too!!!

        // So the ans for this is "IT WILL NOT CHANGE" due to immutability
        // strings are immutable in java
        // on changing it will create a new object of the variable and will not change
        // the existing obj.

         String name1= "Abhii";
        System.out.println(name1);
        name1 = "Bhattacharjee";  // Here we have created a new object of that ref variable.
                                 // Firstly name1 was pointing towards Abhishek then name1
                                 // was pointing towards Bhattacharjee.
        System.out.println(name1);

        // Q. Why we cant modify string object ?
        // ans -> for security reasons.









    }
}
