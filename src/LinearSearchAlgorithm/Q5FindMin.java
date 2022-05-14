package LinearSearchAlgorithm;

public class Q5FindMin {
    public static void main(String[] args) {

        int[] arr={34,67,89,96,76,54,23,45,2};

        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
