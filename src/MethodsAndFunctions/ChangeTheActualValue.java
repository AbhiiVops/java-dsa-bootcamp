package MethodsAndFunctions;

import java.util.Arrays;

public class ChangeTheActualValue {
    public static void main(String[] args) {

        // 1. In java there is no concept of pointers.
        // 2. In java there is no pass by reference,there is only pass by value.

        // Create an Array
        int[] arr ={1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

      static void change(int[] nums) {
        nums[0]= 99; // If you make a change to the object via this reference variable then same value
                    // will get changed
         }
}
