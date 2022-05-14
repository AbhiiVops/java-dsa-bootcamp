package LinearSearchAlgorithm;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {

        // Q.  Find Numbers with Even Number of Digits

       int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));

       System.out.println(digits(-456236723));
        System.out.println(even(6236633));

//        System.out.println(digits2(6262362));
    }

    // function to find no. of no. with even digits
    static int findNumbers(int[] nums) {

        int count =0;
        for(int e:nums) {
            if(even(e)){
                count++;
            }
        }
        return count;
    }

    // func to check whether a no. contains even  no of digits or not
    static boolean even(int num){
        int noOfDigits = digits(num);
        return noOfDigits % 2==0;
    }

    // count no. of digits in a number

    // A shortcut/optimised  way(formula) to directly count the no. of digits.

//    static int digits2(int num) {
//        if(num <0) {
//            num *= -1;
//        }
 //       return (int)(Math.log10(num)+1);
//    }

    // Normal way
    static int digits(int num) {


        if(num <0) {
            num *= -1;
        }

        if(num==0){
            return 1;
        }

        int count=0;
        while(num>0) {
            count++;
            num /= 10;
        }
        return count;
    }

}
