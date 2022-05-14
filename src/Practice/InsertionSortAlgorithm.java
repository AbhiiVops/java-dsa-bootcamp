package Practice;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void InsertionSort(int[] arr) {
        for(int i=0;i<= arr.length-2;i++){

            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);

                }

            }
        }
    }

    static void swap(int[] arr , int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
