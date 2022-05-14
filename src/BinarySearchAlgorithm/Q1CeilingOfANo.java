package BinarySearchAlgorithm;
// Q. How do we get to know whether to apply binary search on a particular ques or not
// Ans : If the given array is sorted then simply apply BS

public class Q1CeilingOfANo {
    public static void main(String[] args) {

        // Same Concept of BS just return start instead of returning -1

        // Ceiling -> smallest element in array >= target element

        // Intuition:
        // e  target  s --> our target element will lie between end and start
                         // but here the condition for while loop violated
        // start <= end -> when while loop breaks Start = end +1
        // Next big no. when no ans found will be the start element
        // (since start is now the smallest element which is greater
        // than equal to the target element

        int[] arr = {-18,-12,-8,-4,0,12,24,25,56,75,98,102};
        System.out.println(Ceiling(arr,26));

    }

    // return the index of the smallest no >= target
    static int Ceiling(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;

        // but what if the target is greater than the greatest number in the array ?
        if (target > arr[arr.length -1]) {
            return -1;
        }

        while(start<=end){

            int mid = start +(end-start)/2;

            if(target >arr[mid]) {
                start = mid+1;
            }
            else if(target<arr[mid]) {
                end=mid-1;
            }
            else if(target== arr[mid]) {
                return mid;
            }

        }

    return start;
    }
}
