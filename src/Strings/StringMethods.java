package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "AbhIsHEk";
        System.out.println("Length method " +name.length());
        System.out.println("toLowercase " +name.toLowerCase());
        System.out.println("toUppercase " +name.toUpperCase());
        System.out.println("Trim " + name.trim());
        System.out.println("Strip " +name.strip());
        System.out.println("Split " + Arrays.toString(name.split(" ")));
        System.out.println("ToCharArray " + Arrays.toString(name.toCharArray()));
        System.out.println("subString " +name.substring(2));
        System.out.println(name.substring(2,6));
        System.out.println("Replace " +name.replace('I','b'));
        System.out.println("StartsWith " +name.startsWith("B"));
        System.out.println("endsWith " +name.endsWith("ek"));
        System.out.println("CharAt " +name.charAt(2));
        System.out.println("indexOf " +name.indexOf("H"));
        System.out.println(name.indexOf("S",4));
        System.out.println(name.indexOf('k'));
        System.out.println("LastIndexOf " +name.lastIndexOf("i"));
        System.out.println(name.lastIndexOf("s",2));
        System.out.println(name.equals("Abhii"));
        System.out.println("equals " +name.equalsIgnoreCase("abhishek"));


    }
}
