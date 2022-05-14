package LinearSearchAlgorithm;

public class Q4FindMinimum {
    public static void main(String[] args) {

        int[] arr={34,67,89,96,76,54,23,45,2};

        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        int max = arr[0];

        for(int i=0;i<arr.length;i++) {
            if(arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }
}
