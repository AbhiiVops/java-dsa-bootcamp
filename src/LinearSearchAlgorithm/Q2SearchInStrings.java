package LinearSearchAlgorithm;

import Arrays.Arrays2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2SearchInStrings {
    public static void main(String[] args) {

        String name= "Abhishek";
        // System.out.println(Arrays.toString(name.toCharArray()));
        char target = 'b';
        System.out.println(SearchInStrings(name,target));
    }

    static boolean SearchInStrings(String str,char target) {
          if(str.length() ==0) {
              return false;
          }

//          for(int i=0;i<str.length();i++) {
//              if(target == str.charAt(i)) {
//                  return true;
//              }
//          }
//
//          return false;

        // Using enhanced for loop :
        for(char ch: str.toCharArray()) {
            if(ch== target ){
                return true;
            }
        }

        return false;
    }

        }

