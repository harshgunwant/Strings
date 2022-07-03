package com.company;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        //concatenation
        //concat with different data structure and types

        System.out.println('a'+'b'); //will convert the characters into their ascii value.
        System.out.println((char) ('a'+3)); //will convert a to ascii value that is 97 and then add 3 to it. //can typecast it also.
        System.out.println("a"+"b"); //concat of 2 strings
        System.out.println("a"+1); //will convert 1 to a string because every object calls the tostring() method.
        System.out.println("a"+ new ArrayList<>()); //this also calls the tostring method and return an empty
        System.out.println("hhhh"+new Integer(56)); //every wrapper class calls the tostring method


        //System.out.println(new ArrayList<>() + new Integer(56);
        //the above statement will show wrror as the concat operator( + ) only works with primitive data types or a string
        //primitive data types include int, char, float, double etc.

        //but this will work
        System.out.println(new ArrayList<>() + "" + new Integer(56));
    }
}
