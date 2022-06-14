package com.company;

public class Main {

    public static void main(String[] args) {
        //Declaringvariable
        int a=10;
        int[] array={1,2,4};

        //what about a string?
        String name="harsh";

        //how is this being stored in the memory?
        String c="gunwant";
        String b="gunwant";

        //PROOF
        System.out.println(c==b); //will show true;

        //here both of them are pointing to the same string in the heap pool
        //Similarly it would not create 10 objects of gunwant if 10 reference variables are created.
        //all variables will point to the same object.


        // Introducing 2 concepts:
        // 1. STRING POOL
        //A pool is created in the heap memory.
        String d="hello";   //allocated in the heap pool by java string class privately.
        String e=new String("hello"); //created im the heap no in the heap pool.

        // 2. IMMUTABILITY
        //Strings are immutable
        //for security reasons.
        String str="harsh";
        str.concat("gunwant");
        //this will create a copy of str and then make the changes.
    }


}
