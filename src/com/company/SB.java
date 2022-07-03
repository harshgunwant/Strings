package com.company;

public class SB {
    public static void main(String[] args) {
        StringBuilder bobThebuilder=new StringBuilder(); //initialized in heap
        for(int i=0;i<26;i++){
            char a=(char)('a'+i);       //this will first convert char a to its ascii value and then add i to it.
            //as it is typecasted it will then convert int to char.
            bobThebuilder.append(a);
        }
        System.out.println(bobThebuilder);

        //now as we know that string builder is mutable so,,,,
        System.out.println(bobThebuilder.deleteCharAt(1));//will delete b
    }
}
