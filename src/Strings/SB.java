package Strings;

public class SB {
    public static void main(String[] args) {

        // checkout string builder methods from the geeks for geeks...
       StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+ i);
            builder.append(ch);
        }
        System.out.println(builder.toString()); // --> calling our own toString() method.
    }

}
