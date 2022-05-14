package LinearSearchAlgorithm;

public class Q7MaxIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {{14, 27, 38},
                {565,89},
                {673, 7921, 822, 9}};

        System.out.println(max(arr));

    }

     static int max(int[][] arr) {

  //      int max = arr[0][0];  //--> here we can also consider the max value to be the min value of the integer (Integer.MIN_VALUE)

//        for(int i=0;i<arr.length;i++) {
//            for(int j=0;j<arr[i].length;j++) {
//                if(arr[i][j]> max) {
//
//                    max = arr[i][j];
//                }
//            }
//        }
//        return max;

         // We can use enhanced for loop here as we are not dealing the index of the array

         int max = arr[0][0];
         for(int[] a : arr) {
             for(int e: a) {
                 if(e> max) {
                     max =e;
                 }
             }
         }
       return max ;

    }
}

