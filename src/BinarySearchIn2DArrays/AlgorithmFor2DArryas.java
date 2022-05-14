package BinarySearchIn2DArrays;

import java.util.Arrays;

public class AlgorithmFor2DArryas {
    public static void main(String[] args) {
        // Algorithm :
        // Run a nested for loop and if e[at any index]==target return that index
        // Time complexity :
        // suppose the row is m and the column is n then:
        // In the worst case it will make O(m*n) comparisons

        // When in a question you are given large search spaces try to minimise the
        // search space . This  is a good hint for coding interviews

        // Lets consider an 2D array :
/*
        int[][] arr={{10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}    };

         -> The array is sorted (it is given)
         -> Here we can't iterate through each element to find the target no
            (i.e, by forming a nested loop)
         -> So we'll define lower bound and upper bound
            Lower bound = first element of fist row (i.e, 10) and
            Upper bound = last element of first row (i.e, 40)
         -> Now Use Cases
           Case1 : If element == target
                   -> ans found
           Case2: If element >target
                  -> col--
                  suppose the element is the upper bound(40) and since the upper bound is
                  larger than the target then all the element in that col is going to be larger
                  than the no. the since the array is sorted in ascending order . So we can
                  ignore all the elements in that array
           Case3: If element < target
                  -> row++
                  Now that after the upper case we are on 30 now  that is in col-- .
                  Here the element is smaller than the target thn all the elements before 30
                  is going to be less than the target since the array is in asc order.So we can
                  ignore all the elements in that row .
                  we do row++


              ** Loop will run from row=0 till column = last
                 where row<arr.length and col>0

                 Time complexity : it will make n comparisons in row reducing the space every time
                                   and n comparisons in col by reducing the space everytime. so
                                   n + n = 2n
                                   O(n) -> Is the time complexity for this algorithm


 */
       // It is a sorted matrix :
        int[][] arr={{10,20,30,40},
                     {15,25,35,45},
                     {28,29,37,49},
                     {33,34,38,50}    };
        int target = 39;

        System.out.println(Arrays.toString(search(arr,target)));

    }


    static int[] search(int[][] matrix,int target) {
         int r =0;
         int c= matrix.length-1;

         while(r<matrix.length && c>0) {

             if(matrix[r][c]== target) {
                 return new int[]{r,c};
             }
             else if(matrix[r][c] < target) {
                 r++;
             }
             else c--;

         }
         return new int[]{-1,-1};
    }
}
