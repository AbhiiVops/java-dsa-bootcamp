package Recursion;

public class RecursiveNumberExample {
    public static void main(String[] args) {
        print(1);
    }

     static void print(int n) {
        // Base condition
        if(n==5){
            System.out.println(5);
            return;
        }
//        if(n>5){
//            return;
//        }
         System.out.println(n);


        // recursive call
         // if you are calling a function again and again,you can treat it as a separate call in the stack
         // every function call will occupy a separate memory in the stack.

         //this is called tail recursion
         // this is the last function call
         print(n+1);
    }
}
