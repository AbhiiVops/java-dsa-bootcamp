package SortingAlgorithms;

import java.util.Arrays;

public class CyclicSortAlgorithm {
    public static void main(String[] args) {


        int[] arr= {3,5,2,1,4}; //--> the input array should be continuous in case of cycle sort
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){

        int i=0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }

    }

    static void swap(int[] arr , int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
