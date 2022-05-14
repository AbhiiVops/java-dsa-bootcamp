package BinarySearchAlgorithm;


//   // https://leetcode.com/problems/find-in-mountain-array

public class Q7FindInMountainArray {
    public static void main(String[] args) {

       int[] arr = {1,2,3,4,5,3,1};
       int target = 3;

        System.out.println(search(arr,target));


    }

    static int search(int[] arr,int target )  {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        //  else try to search in the second half
        else {
            return orderAgnosticBS(arr,target,peak+1,arr.length-1);
        }
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {   // this time start < end and not start <=end that we earlier used to do

            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of the array
                // this may be the ans, but look at left
                // this is why end != mid-1;
                end = mid;
            } else {
                // you are in asc part of the array
                start = mid + 1; // because we know that mid+1 element> mid element

            }

        }
        // in the end, start == end and pointing to the largest number because of the two check we have provided
        // start and end are always trying to find max element in the above two checks
        // hence,when they are pointing to just one element, that is the max one because
        // that what the checks say

        // More elaboration:
        // At the every point of time for start and end ,they have the best
        // possible ans till that time and if we are saying that only one item
        // is remaining ,hence cuz of above line  that is the best possible ans.

        return start; // or return end as both are equal
    }

    static int orderAgnosticBS(int[] arr,int target,int start,int end ) {

        boolean isAsc = arr[start] < arr[end];

        while (start<=end) {

            int mid = start +(end-start)/2;

            if(target == arr[mid]) {
                return mid;
            }

            if(isAsc){
                if(target>arr[mid]) {
                    start = mid+1;
                }
                else if(target <arr[mid]) {
                    end = mid-1;
                }
            }
            else {
                if(target>arr[mid]) {
                    end = mid-1;
                }
                else if(target <arr[mid]) {
                    start = mid+1;
                }
            }

        }
        return -1;
    }

}
