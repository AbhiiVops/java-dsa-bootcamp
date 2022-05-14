package LinearSearchAlgorithm;

import java.util.Arrays;

public class Q6SearchIn2DArray {
    public static void main(String[] args) {

        // Return the index

        int[][] arr = {{1, 2, 3},
                       {4, 5},
                       {6, 7, 8, 9}};

        int target = 9;

        int[] ans = search(arr,target); // format of return value {i,j}

        System.out.println(Arrays.toString(search(arr,target)));
    }

     static int[] search(int[][] arr, int target) {
        if(arr.length==0) {
            return new int[]{-1};
        }

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
