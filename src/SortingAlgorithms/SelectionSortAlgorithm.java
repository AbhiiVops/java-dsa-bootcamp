package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public static void main(String[] args) {

        /*
        Selection Sort Algorithm : Take out the maximum value in the array and swap it with
                                   its correct index

        Time complexity :
        Best Case -> O(N*N)
        Worst Case -> O(N*N)
        
        //checkout the self-made notes for better understanding

         */

        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static int getMaxIndex(int[] arr,int start,int end) {
        int max = start;  // Consider ki max element zeroth index pe hai
        for(int i=0;i<=end;i++) {
            if(arr[i]>arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first,int second) {
        int temp = arr[first] ;
        arr[first] = arr[second];
        arr[second]= temp;
    }

    static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length;i++) {
         //   for(int i=0;i<=arr.length-i-1;i++) {   --> We can write this too ....
            // find the maximum element in the remaining array and swap it with the correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
}
