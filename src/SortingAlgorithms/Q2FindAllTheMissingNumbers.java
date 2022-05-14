package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
// Google Question
public class Q2FindAllTheMissingNumbers {
    public static void main(String[] args) {

        int[] arr={4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);
        System.out.println();
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {  //--> Since the ans can be of variable length we have used the List Interface
        int i=0;
        while(i<arr.length) {
            int correctIndex = arr[i] -1;

            if(arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }
        }

        //Just find the missing numbers.
        List<Integer> ans = new ArrayList<>();
        for(int index =0;index<arr.length;index++) {
            if(arr[index]!= index+1) {
                ans.add(index+1);
            }
        }

         return ans;


    }

    static void swap(int[] arr , int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
