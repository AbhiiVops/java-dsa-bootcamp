package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "abcba";
        System.out.println(isPalindrome(s1));

    }
  static boolean isPalindrome(String b) {
        char[] str = b.toCharArray();
        int start =0;
        int end = str.length-1;
        while(start <= end) {
            if(str[start] == str[end]) {
                start++;
                end--;
            }
            else return false;

        }
        return true;

  }
}
