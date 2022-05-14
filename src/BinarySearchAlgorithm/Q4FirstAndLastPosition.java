package BinarySearchAlgorithm;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Q4FirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr= {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(arr,target)));

    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};    // By default, we are giving this value

        ans[0] = search(nums,target,true);
       if(ans[0] != -1) {
           ans[1] = search(nums,target,false);
       }

       return ans;

    }

    static int search(int[] nums, int target, boolean findFirstIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;



        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            }
          else if (target < nums[mid]) {    ///---> Writing else here is very imp
                end = mid - 1;
            } else {
                //potential ans found
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;

    }

}
