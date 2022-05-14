package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String1 are immutable in java
        // Arrays are mutable in java

        // --> Multidimensional array is arrays of arrays.

        // int[][] arr = new int[3][];  // --> Adding no of rows is necessary  but adding no of columns is not necessary
        //OR

        int[][] arr = {{1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}};

//        for(int row=0;row<arr.length;row++) {   //--> arr.length will give the length of the row
//            for(int col=0;col<arr[row].length;col++){  //--> it may be possible that every row has different no. of columns so we use arr[row].length
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.println();
//        }

        // OR  --> using string function

//        for(int row=0;row<arr.length;row++) {
//            System.out.print(Arrays.toString(arr[row]));
//            System.out.println();
//        }

        //OR  // --> using enhanced for loop
//        for(int[] a: arr) {
//            System.out.println(Arrays.toString(a));
//        }


        // Input
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                arr1[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


    }
}
