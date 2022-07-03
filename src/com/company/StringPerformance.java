package com.company;

public class StringPerformance {
    public static void main(String[] args) {
        //adding char to an empty string and forminig a bigger string
        String str="";
        for(int i=0;i<26;i++){
            char a=(char)('a'+i);       //this will first convert char a to its ascii value and then add i to it.
            //as it is typecasted it will then convert int to char.
            str+=a;
        }
        System.out.println(str);

        //this whole piece of code is utilizing too much of memory as everytime one new "abcd.." string is created no reference
        //variable will be pointing to the older version before.
        // so at last when we get "abcdef....z" the previous strings like "a","ab",...."abc...xy" will be there in the memory;
        // with no reference variable pointing to them.

        //FOR OUR RESCUE WE HAVE :::: StringBuilder
    }
}
