package BinarySearchAlgorithm;

public class Q2FloorOfANo {
    public static void main(String[] args) {

        // Same concept as the ceiling just return end instead of start

        // Floor --> greatest element in array <= target element

        int[] arr = {-18,-12,-8,-4,0,12,24,25,56,75,98,102};
        System.out.println(Floor(arr,-26));

    }

    // return the index of the greatest no <= target
    static int Floor(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;

        // but what if the target is the smallest no in the array :
//        if(target <arr[start]) {
//            return -1;
//        }

        while(start<=end){

            int mid = start +(end-start)/2;

            if(target >arr[mid]) {
                start = mid+1;
            }
            if(target<arr[mid]) {
                end=mid-1;
            }
            if(target== arr[mid]) {
                return mid;
            }

        }

        return end;
    }
}
