package Strings;

public class Comparison {
    public static void main(String[] args) {

        String a = "Abhishek";
        String b ="Abhishek";

        // == --> this comparator gives true when both the ref variable are pointing
        // to the same obj.
        System.out.println(a==b); // --> since a & b are pointing to the same obj in
                                  // the string pool it will give true

        // How to create diff obj of same value ?
        // so we'll explicitly say to java that i dont care what optimisation you are doing
        // i want u to create a new obj of that ref variable.
        // new obj are created using the new keyword.

        String name1 = new String("Abhishek");
        String name2 = new String("Abhishek");
        // now These values are created outside the pool but inside the heap
        // here now two diff objects have been created.
        // now since both the ref variable are pointing towards the two diff obj
        // (a==b) will be false in this case.

        // --> So when u need to check only value use .equals() method
     //   System.out.println(name1==name2);  // -> it will give false since now they are pointing to two diff obj

        // But we"ll not do in this way(i.e, by explicitly declaring the obj we"ll utilise the string pool)
        System.out.println(name1.equals(name2)); //--> since it is comparing only the
                                                // values it will give true in this case
        System.out.println(name1.charAt(0));



    }
}
