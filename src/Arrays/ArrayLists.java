package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        // Lists are mutable
        // if we don't know the size of the array we can use the concept of arrayLists
        // Syntax :
        ArrayList<Integer> list = new ArrayList<>(10);  // Integer is a wrapper class..
        list.add(67);
        list.add(83);
        list.add(378);
        list.add(221);
//        list.add(34);
//        list.add(43);
//        list.add(98);
//
 //          list.add();  //--> like this is used to add items to the lists
//        System.out.println(list);       // We can directly print lists
//        System.out.println(list.size());    // tells about the size of the list
//        System.out.println(list.remove(2));   // remove the element at the specified index
//        System.out.println(list.contains(71));  // returns  a boolean value
//        System.out.println(list.set(0,99));     // Replace the item with the element provide at the specified index

      //  System.out.println(list.toArray());  // we can't do like this

        Scanner sc = new Scanner(System.in);

       // input
        for(int i=0;i<5;i++) {
            list.add(sc.nextInt());  // directly write sc.nextInt().. creating reference and adding it here will not work
        }

        //   get item at any index
        for(int i=0;i<5;i++) {
            System.out.print(list.get(i) + " ") ;  //pass index here, list[index] syntax will not here
        }





    }
}
