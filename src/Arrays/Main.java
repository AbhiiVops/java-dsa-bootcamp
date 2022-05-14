package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Taking input
        int[] arr1 = new int[5];
        for(int i=0;i<arr1.length;i++) {
            arr1[i] = sc.nextInt();
        }

        // Output
        for(int a : arr1) {
            System.out.print(a + " ");
        }

        // An Array is a collection of datatype

        //   int[] rnos = new int[5];

        int[] rnos;// --> declaration of array rnos is getting define in the (stack)
        // --> this happens at compile time
        rnos = new int[5]; // -->initialisation ->  actually here object is being created in the memory(heap)
        // Memory allocation happens at run time and is known as dynamic memory allocation

        // --> * In java there is no concept of continuous memory allocation as there is no concept of pointers in java
        // so memory allocation may or may not be continuous . It totally depends on JVM.

        // Creating array of primitives
        int[] arr = new int[5];
        arr[1] = 45;
        arr[2] = 72;
        arr[3] = 735;
        arr[4] = 12;

        for(int i = 0;i< arr.length;i++) {   // m--> Printing the arrays using for loop
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        System.out.println(Arrays.toString(arr));  // --> naive way of printing

        for(int num:arr) {    // --> Using enhanced for loop
            System.out.print(num + " ");
        }

    }
    }
