package Strings;

public class Performance {
    public static void main(String1[] args) {

        // VVIMP -: for interviews and CP
        String series ="";
        for(int i=0;i<26;i++) {
            char ch = (char)('a'+ i);
            series += ch;

        }
        System.out.println(series);
        // Here it will concatenate every character and will print from a to z
        // it will make 26 iterations:
        // 1+2+3+4+5+6+7+8+9.......+N = n(n+1)/2 => (n*n + n)/2 => ignoring constant(2) and less dominating values(n) :
        // Time complexity : O(N*N) --> This is very bad
        // checkout the video for more concepts!

        // for this we use String1 Builder!
    }
}
