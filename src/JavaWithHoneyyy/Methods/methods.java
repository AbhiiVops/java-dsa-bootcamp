package JavaWithHoneyyy.Methods;

public class methods {
    public static void main(String[] args) {

//      int value = mySum(20,20);
//        System.out.println(value);


        // function call
     //   System.out.println(mySum(10,20));
       // System.out.println(mySum(1200,200));

        // function call by creation of object of the class
        methods obj = new methods();
        System.out.println(obj.mySum(20,30));



    }

    // user defined functions
  public static int mySum(int a,int b) {

      return a+b;

    }

}
