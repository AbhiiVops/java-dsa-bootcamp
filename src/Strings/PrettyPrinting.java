package Strings;

public class PrettyPrinting {
    public static void main(String1[] args) {
        float a = 453.1264f;
        System.out.printf("Formatted numbers is %.2f \n",a); //--> if we wish to print
        // the float no. upto two decimal places use %.2f (f since it is a float no.)
        // here it will print 453.13 -->i.e, it also does round off
        // -> /n adds a new line

        // Format Specifiers --:
        // With printf(), you can print values such as numbers, Strings, dates,
        // etc. To let the method know what exactly you're trying to print, you
        // need to provide a format specifier for each of the values

//        There are many format specifiers we can use. Here are some common ones:
//
//               %c - Character
//                %d - Decimal number (base 10)
//                %e - Exponential floating-point number
//                %f - Floating-point number
//                %i - Integer (base 10)d
//                %o - Octal number (base 8)
//                %s - String1
//                %u - Unsigned decimal (integer) number
//                %x - Hexadecimal number (base 16)
//                %t - Date/time
//                %n - Newline

        System.out.printf("Pie : %.2f %n",Math.PI);
        System.out.printf("Hello my name is %s and I am %s","Abhishek","Cool"); // -> %s stands for string

        //
    }
}
