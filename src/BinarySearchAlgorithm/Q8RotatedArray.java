package BinarySearchAlgorithm;

// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
// In this :  code for duplicates values and distinct values both are there

public class Q8RotatedArray {
    public static void main(String[] args) {

        // Google -> rotated array -> To know the meaning of the rotated array
        // Format of rotated array :
        // The first half will contain the nos in ascending order then pivot and
        // then again nos in ascending order
        // Rotated array : [ asc  pivot  asc ]
        // * Pivot : # Where the particular thing is getting changed
        //          # We can say that pivot is the largest no in the array
        //          # from where the two half's in the array are in ascending order

        // Algorithm
        // 1.  find pivot
        // 2. Search in the first half -> simple BS from (s=0,e=pivot)
        // 3. otherwise search in the second half -> (s=pivot+1,e=end)

        // How to find pivot ?
        // Suppose arr=[3,4,5,6,7,0,1,2]
        // Ans -> When we will find pivot ?

        // Case-1 -> when you find that e[mid] >e[mid+1] -> i have found the pivot
                     // ans = mid

        // Case-2 -> when you find that e[mid-1] >e[mid] -> i have found the pivot
        //            ans = mid -1

        // Case-3 -> when e[s] >= e[mid]
        //  arr = [4,5,6,0,1,2,3] -> {mid = e[3]}
        // All elements  from mid will be < start
        // Hence we can ignore all these elements of RHS since we are looking for the peak
        // ** end = mid-1 **

        // Case-4 -> e[s] < e[mid]
        // arr=[3,4,5,6,2]  -> {mid=e[2]}
        // All elements  from mid will be > start
        // Hence we can ignore all these elements of LHS since we are looking for the peak
        // ** start = mid +1 **
        //If this contain pivot it would have been returned in Case 1 and 2
        // Hence proved that bigger no. lies ahead hence ignore mid and put s= mid+1;

        int[] arr ={4,5,6,6,6,7,0,2,2,2,1,1,2};
        int target=2;

        System.out.println(search(arr,target));


    }

    static int search (int[] arr,int target) {
        int pivot = findPivotWithDuplicates(arr);
       // int pivot = findPivot(arr);


        // This is my way of searching an element in the pivot
//        int firstHalf = binarySearch(arr,target,0,pivot);
//        if(firstHalf != -1){
//            return firstHalf;
//        }
//        else return binarySearch(arr,target,pivot+1,arr.length-1);

        // If you did not find a pivot,it means the array is not rotated
        if(pivot == -1) {
            //just do normal binary search
            return binarySearch(arr,target,0,arr.length-1);
        }
        // if pivot is found
        // suppose arr=[4,5,6,7,0,1,2]
        // Case 1 -> e[pivot] == target // -> ans
        // Case 2 -> target >= start element -> in that case my search space is reduced to
        //           search space = (start,pivot-1)
        // Case 3 -> target < start element -> that means that all the element before pivot is bigger than the target
        //           so in that case our search space is reduced to
        //           search space = (pivot+1,end)

        else if(arr[pivot]== target) {
            return pivot;
        }
        else if(target>=arr[0]) {
            return binarySearch(arr,target,0,pivot-1);

        }
        else return binarySearch(arr,target,pivot+1, arr.length-1);

    }

    static int binarySearch(int[] arr,int target ,int start ,int end) {


        while(start<=end) {
            // find the middle element
//         int mid = (start+end) /2; // might be possible that (start+end) exceeds the range of integers.
            int mid = start +(end-start) / 2;
            if(target> arr[mid]) {
                start = mid+1;
            }
            else if(target<arr[mid]) {
                end=mid-1;
            }
            //    else if (target ==arr[mid]) {   // --> we can also return as else { return mid };
            // ans found
            else {
                return mid;
            }
        }
        return -1;
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
