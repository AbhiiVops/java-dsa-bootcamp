package SortingAlgorithms;
// https://leetcode.com/problems/set-mismatch/
public class Q5SetMismatch {
    public static void main(String[] args) {

    }
   static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1}; //-> arr[index] returns the duplicate no. and
                                                       // index+1 gives the repeated no.
            }
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
