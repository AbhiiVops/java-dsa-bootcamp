package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b'); // -> 195 --> it will print the value according to the ascii values
        System.out.println("a"+"b");  // -> ab  --> it will concatenate the string
        // "a" + "b" has created a new obj ab. After that garbage collector will collect the
        // "a" and "b" or if you wish you can store it too
        System.out.println((char)('a'+3)); // -> d  --> it will print d since we have typeCasted this
        System.out.println('a'+3); // -> 100 --> it will print 100

        System.out.println("a"+1); // -> a1 --> reason below
        // this is same as after a few steps: "a" + "1"
        // integer will be converted to Integer(its wrapper class) that will call toString()

        System.out.println("Abhii"+new ArrayList<>());  // it will print Abhii[] by calling the toString() method
        System.out.println("Abhii"+ new Integer(56)); // -> it will also call the toString() method and  will print Abhii56

        // --> VVIMP
    //    System.out.println(new ArrayList<>() + new Integer(56)); // -> the operator '+' in java
        // is only defined  for the primitives and when any of these values is a string

        System.out.println(new ArrayList<>() +""+ new Integer(56)); // -> here we have added an empty string
        // so it will work since atleast 1 string is must

        // --> So in String1 function the + operator is being overloaded. This is known as operator overloading.
        // i.e, the + operator has been provided with more functionalities


       System.out.println(2+new Integer(56)); // -> like here 2 is of type integer which
        // is primitive , it will be converted to string by the println using toString() method
        // and the output will be 58.
    }
}
