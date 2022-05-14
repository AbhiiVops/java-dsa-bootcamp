package JavaWithHoneyyy;

public class Arrays {

    public static void main(String[] args) {


        // 1st way to declare an array
        int[] arr; // -> declaration
        arr = new int[5]; // --> memory allocation

        // 2nd way of declaration
        int[] arr1 = new int[5]; // -> declaration + memory allocation

        // 3rd way of declaration
        int[] arr2 = {1,2,3,4,5}; // -> declaration + memory allocation  + initialization

         // to find the length of the array we have a function known as length()

        int size = arr2.length;
//        System.out.println(size);
//
//        System.out.println(arr2.length);

        // indexing of the array goes from 0 -> (arr.length-1)

        int a = 23;
      //  System.out.println(a);

        for(int i=0;i<=arr2.length-1;i++) {
            System.out.println(arr2[i]);
        }











    }

}
