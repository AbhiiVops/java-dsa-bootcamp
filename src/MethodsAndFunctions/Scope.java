package MethodsAndFunctions;

public class Scope {
    public static void main(String[] args) {

        // * Anything that is initialised outside can be used inside but anything
        // initialised inside can be used outside *


        int a = 99; // --> Initialising
        { a =78; } // --> Updating // since they are in the same scope therefore the original value will get changed
        System.out.println(a); // it will print the modified value

      String name = "Abhii";
      name= "Abhishek";
        System.out.println(name); // it will also print the modified value
    }
}
