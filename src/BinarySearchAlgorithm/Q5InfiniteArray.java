package BinarySearchAlgorithm;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class Q5InfiniteArray {
    public static void main(String[] args) {
        // Geeks for Geeks question.
        // Q. Find position of an element in a sorted array of infinite numbers.
        // Here since in the question it is given that the array is infinite we
        // are not going to use the arr.length function.

        // * Try to solve through brut force by using linear search, go till n comparisons
        // making time complexity of O(n) comparisons (that is worst case).

        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr,int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range

        while (target > arr[end]) {
            int newStart = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;  // We cannot update start above the end as in the above formula
            // we are using  value of start while calculating the end and this
            // will change the ans of start as a result.

            // Finding size of array by indices : (very nice explanation in video)
                // size = e -(s-1) = e -s+1

        }

        return BS(arr,target,start,end);
    }

    static int BS(int[] arr , int target,int start,int end ) {

        while(start <=end) {


            int mid = start +(end-start)/2;

            if(target>arr[mid]) {
                start = mid+1;
            }
            else if(target <arr[mid]) {
                end =mid-1;
            }
            else  {
                //ans found
                  return mid;
            }
        }
        return -1;
    }

}

