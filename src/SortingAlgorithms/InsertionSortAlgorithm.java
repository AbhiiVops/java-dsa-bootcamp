package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {

        /*
         Insertion sort : Sorting the array partially
         Time Complexity : Best case -> O(N)
                           Worst case -> O(N*N)
                           where N is the size of the array

       */



        int[] arr = {5,4,3,2,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {

            for(int j=i+1;j>0;j--) {

                if(arr[j-1]>arr[j]) {
                    swap(arr,j,j-1);
                }
            }
        }
    }

    static void swap(int[] arr,int start,int end) {
        int temp = arr[start] ;
        arr[start] = arr[end];
        arr[end]= temp;
    }

}
