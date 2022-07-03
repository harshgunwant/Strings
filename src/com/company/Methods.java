package com.company;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name1="delly gunwant";
        //testing different functions/methods of string class.
        System.out.println(name1.concat("hahaha"));
        System.out.println(name1.concat(1+'a'+""));
        //or we can do this
        System.out.println(Arrays.toString(name1.toCharArray()));
        System.out.println(name1.toLowerCase());
        //even after all the cahanges that we have made above the string will still remain intact as strings are immutable.
        //everychange made to the string will be done on its copy and saved.
        //but it will be sent to the garbage collection if no reference variable is pointing to it.
        System.out.println(name1);
        System.out.println(name1.indexOf('z'));   //.indexof function sends a -1 if char is not found.
        System.out.println(name1.indexOf('g'));

    }
}
