package SortingAlgorithms;
//https://leetcode.com/problems/first-missing-positive/submissions/
import java.util.Arrays;

public class Q6firstMissingPositive {
    public static void main(String[] args) {
        int[] arr= {1,2,0};
        System.out.println(missing(arr));

    }
    static int missing(int[] arr) {


        int i=0;
        while(i<arr.length) {
            int correctIndex = arr[i]-1;

            if(arr[i] > 0 && arr[i] <= arr.length && arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

        // search for first missing number
        for(int j=0;j< arr.length;j++) {
            if(arr[j]!=j+1) {
                return j+1;
            }

        }
        // case 2
        return arr.length+1;
    }
    static void swap(int[] arr , int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
