package BinarySearchAlgorithm;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {


        int[] arr ={5, 1, 2, 3, 4};
        int count = rotationCount(arr);
        System.out.println(count);
    }

   static int rotationCount(int[] arr) {
        int pivot= findPivot(arr);

        return pivot+1;
    }

    // this will work for only distinct values:
    static int findPivot(int[] arr) {
        int start =0;
        int end =arr.length-1;

        while(start <=end) {
            // 4 cases over here
            int mid = start+(end-start)/2;


            if( mid< end&& arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if(mid> start && arr[mid] <arr[mid-1]) {
                return mid-1;
            }
            else if(arr[start]>= arr[mid]) {
                end = mid-1;
            }
            else start = mid + 1;
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start =0;
        int end =arr.length-1;

        while(start <=end) {
            // 4 cases over here
            int mid = start+(end-start)/2;


            if( mid< end&& arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if(mid> start && arr[mid] <arr[mid-1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            else if(arr[mid]== arr[start] && arr[mid] == arr[end]) {

                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
