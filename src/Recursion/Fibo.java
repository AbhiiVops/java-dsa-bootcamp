package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }

    static int fibo(int n){
        // base condition
           if(n<2){
            return n;
        }

           // this is not a tail recursion cuz we are saying get the value of fibo(n-1) then
          // fibo(n-2), add both the values and then return the ans
         // so this extra step of adding and returning is not tail recursion.

        return fibo(n-1) + fibo(n-2);
    }
}
