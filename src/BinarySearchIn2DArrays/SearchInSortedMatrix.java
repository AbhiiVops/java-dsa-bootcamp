package BinarySearchIn2DArrays;

import java.util.Arrays;

public class SearchInSortedMatrix {

    // Sorted Matrix -> In Strictly sorted matrix first element of every row > last element of previous row
    // Like for example : 5 > 4
    // 5 is the first element of row 1 which is > last element of row 0 which is 4

    // Simple algorithm :
    // define lower bound and upper bound then find the mid-element
    // on col(you can find it for row too) and perform simple BS on it.
    // 1. Firstly consider the original array space and perform BS on it
    // 2. If target not found the run a loop till the space is reduced to two rows
    // 3. check on the mid-column of the two row whether it contains the target element
    // 4. if target not found in the 3rd step then check the four half made on the either side
    //    of the mid column.

    public static void main(String[] args) {

        int[][] arr={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
                  };
        int target = 100;

        System.out.println(Arrays.toString(search(arr,target)));



    }

    // search in the row provided between the cols provided
    // Check th pseudo Code on folding diary!

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

        // Taking the bigger one(original array space) first :
        while(cStart<=cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};

            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1,-1};
    }


    static int[] search(int[][] matrix,int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Be cautious, the array may be empty

        if (cols == 0){
            return new int[] {-1,-1};
        }
        if(rows ==1) {
           return binarySearch(matrix,0,0,cols-1,target);
        }

        // Upper bound -> first element of first row
        // lower bound -> first element of last row

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        // Run the loop till 2 rows are remaining

        while(rStart<(rEnd-1)) {   // while this is true it will have more than two rows

            int mid = rStart +(rEnd-rStart)/2;

            if(matrix[mid][cMid]== target) {
                return new int[]{mid,cMid};
            }
            else if(matrix[mid][cMid] < target) {
                     rStart = mid;
            }
            else {
                rEnd = mid;
            }

        }

        // now we have two rows
        // check whether the target is in the cols of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart,cMid};
        }
        else if(matrix[rStart+1][cMid]== target) {
            return new int[]{rStart+1,cMid};
        }

        // Otherwise, now search in the four half


        // Search in 1st Half
        if(target <= matrix[rStart][cMid-1]) {
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        // Search in 2nd Half
        else if((target >= matrix[rStart][cMid+1]) && target <=matrix[rStart][cols-1]) {
            return binarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        // Search in 3rd Half
       else if(target <= matrix[rStart+1][cMid-1]) {
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        // Search in 4th Half
//        if(target >= matrix[rStart][cMid-1]) {
//            return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);
//        }

        else return binarySearch(matrix,rStart+1,cMid+1,cols-1,target);

    }
}
