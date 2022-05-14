package Arrays;

public class Q3MaxValueInRange {
    public static void main(String[] args) {

        int[] arr = {1,3,23,49,54} ;
        System.out.println(maxRange(arr,1,3));
    }

    // Work on edge cases here :
    static int maxRange(int[] arr, int start,int end) {

        if(start>end) {
            return -1;
        }

        if(arr == null) {
            return -1;
        }
        int maxVal= arr[start];
        for(int i=start;i<=end;i++) {
            if(arr[i]>arr[start]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
