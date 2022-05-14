package com.abhii;

import java.util.Scanner;
// java follows unicode values that is u can print in any lang!(chinese,hindi,telugu)

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Typecasting:
        // Conditions for typecast:
//        1. The conversion should be compatible
//        2. the range in which the entity is being typecasted should be greater than the source

//    Like while ""typecasting float to int"", it will be not possible as integer contains only
//    whole numbers; but vice-versa is true ""int can be typecasted to float"" as float
//    contains both integer as well as decimals

//        int num = (int)(67.92f);
//        System.out.println(num);

        // automatic type conversion in expression

//        int a = 257;
//        byte b = (byte)(a);  // 257 %256 =1
//        System.out.println(b);   // --> it will print 1, as the range of byte is only upto 256
        // so it says hey my highest value is 256 so i will find the value by giving  the remainder value


        int n = 'A';
        System.out.println(n);   // it will automatically typecast char to int and
                                 // print according to the ascii values i.e, the value of A according
                                  //  to ascii values is 65

        // A question to get all concepts of typecasting :
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    }
}
