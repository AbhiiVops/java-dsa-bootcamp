package Arrays;

import java.util.Arrays;

public class Q1Swap {
    public static void main(String[] args) {

        // Q1. Swap two elements in an array

        int[] arr = {1,3,23,49,54} ;
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
