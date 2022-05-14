package SortingAlgorithms;
// https://leetcode.com/problems/missing-number/
// Amazon Question

public class Q1MissingNumber {
    public static void main(String[] args) {

        int[] arr={0,1};
        System.out.println(missing(arr));

    }

    static int missing(int[] arr) {


        int i=0;
        while(i<arr.length) {
            int correctIndex = arr[i];

            if(arr[i] <arr.length && arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

        // search for first missing number
        for(int j=0;j< arr.length;j++) {
            if(arr[j]!=j) {
                return j;
            }

         }
        // case 2
        return arr.length;
    }
    static void swap(int[] arr , int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
