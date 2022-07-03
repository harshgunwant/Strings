package com.company;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a=456.75464f;
        System.out.println(a);

        //rounding off till 2 decimal digits
        //this %s, %f, %c etc. are called as place holders/format specifiers.
        System.out.printf("my marks out of 500 is %.2f", a);
        System.out.println(" ");
        System.out.printf("the value of pie is %.3f", Math.PI);
        System.out.println(" ");
        System.out.printf("hello my name is %s and my marks are %.2f", "harsh", 86.4374);

    }
}
