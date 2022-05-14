package BinarySearchAlgorithm;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // When the given array is sorted but we dont know whether the
        // array is sorted in ascending or descending order we use order
        // Agnostic BS

        int[] arr = {-18,-12,-8,-4,0,12,24,25,56,75,98,102};  //--> in ascending oder
        int[] arr1 = {102,98,75,56,25,24,12,0,-4,-8,-12,-18}; // --> in descending order

        System.out.println(orderAgnosticBS(arr,25));
        System.out.println(orderAgnosticBS(arr1,56));

    }

    static int orderAgnosticBS(int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc;
        isAsc = arr[start] < arr[end];

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
