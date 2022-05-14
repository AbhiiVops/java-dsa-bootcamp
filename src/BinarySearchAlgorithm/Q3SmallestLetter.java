package BinarySearchAlgorithm;

// Little doubts....

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Q3SmallestLetter {
    public static void main(String[] args) {
        // Q. Find the smallest letter greater than the target.
        // ** Points to be noted **
        // 1. exact same approach for ceiling of no.
        // 2. Ignore the target = what we are looking for
        // 3. Letter wrap Around : arr = {'c','d','f','j'} , target ='j'
        // Letter wraps around means if you find no element greater
        // than the target element then return the first element
        // of the array .
        // We can do this by start % arr.length {since the
        // condition has got violated}

        char[] arr= {'c','f','j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(arr,target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;

        while(start<=end){

            int mid = start +(end-start)/2;

            if(target<letters[mid]) {
                end=mid-1;
            }
            else {
                start = mid+1;   // --> Here dont write the If(target>letters[mid]) part directly
                                // write else start = mid+1
            }
        }

        return letters[start % letters.length];
    }
    }

