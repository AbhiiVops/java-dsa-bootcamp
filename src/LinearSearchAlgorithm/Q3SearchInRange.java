package LinearSearchAlgorithm;

public class Q3SearchInRange {
    public static void main(String[] args) {

          int[] arr={34,67,89,96,76,54,23,45,2};
          int target = 96;
          int start = 1;
          int end= 4;

        System.out.println(InRange(arr,target,start,end));
    }

    static boolean InRange(int[] arr, int target, int start, int end) {

        if(start>end) {
          return false;
        }
        if(arr.length == 0) {
            return false;
        }
        if(end>arr.length-1){
            return false;
        }

        for(int i=start;i<=end;i++){
            if(arr[i] == target) {
                return true;
            }
        }
        return false;

    }
}
