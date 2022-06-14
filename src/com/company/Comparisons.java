package com.company;

public class Comparisons {
    public static void main(String[] args) {

        // LEARNING ABOUT THE == METHOD
        String name1="harsh";
        String name2="harsh";
        System.out.println(name1==name2); //both pointing in the heap pool.

        String a="hell";
        String b=new String("hell");
        String c=new String("hell");
        System.out.println(a==b); //this will give false as a points in the heap string pool while b points in heap.
        System.out.println(c==b); //this will also give false as it both c and b are pointing to diff. hell in the heap memory.


        //LEARNING ABOUT THE .equals METHOD
        String D=new String("hell");
        String E=new String("hell");
        System.out.println(D.equals(E)); //this will give true as it checks the value only.


        //accesing a string
        // we cant do String name="harsh" and then access using name[1].
        //we have a separate method in the String class.
        System.out.println(name1.charAt(1));
    }
}
