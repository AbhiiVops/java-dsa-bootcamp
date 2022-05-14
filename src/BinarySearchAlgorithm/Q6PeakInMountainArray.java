package BinarySearchAlgorithm;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
// https://leetcode.com/problems/find-peak-element/submissions/
public class Q6PeakInMountainArray {
    public static void main(String[] args) {

        // Mountain Array --> also known as bitonic array

        // Mountain Array : The array will be first in ascending order then
        // in descending order and there will be a peak value in b/w that and
        // that value will be called as peak in the mountain array.

        // Some use cases(possibilities) for this ques :
        // 1. If !!!! e[mid] > e[mid+1] !!!! --> Then you are in the decreasing part of
        // the array. In that case there is a possibility that mid element
        // can be the potential ans but still we want to check on the LHS
        // so   **** end = mid **** --> As we want to check on the LHS

        // 2. If !!!! e[mid] < e[mid+1] !!!!--> Then you are in the increasing part of
        // the array. In that case there is a possibility that mid element
        // can be the potential ans but still we want to check on the RHS
        // so   **** start = mid+1 **** --> As we want to check on the RHS
        //start = mid --> As more elements are present which is > than
        // the mid-element, so we will do start = mid.

        // 3. When will the loop break :
        // at last start and end both will point towards the largest no.
        // and in that case the loop will break.


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

        return start; // or return end as both are equal(depends on your choice)
    }
}
