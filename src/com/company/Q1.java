package com.company;

public class Q1 {
    public static void main(String[] args) {
        String str="1.1.11.,.1.";
        System.out.println(changePlease(str));

    }
    static String changePlease(String str1){
        StringBuilder sbb=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)== '.'){  //" to represent a string" and 'to represent a character'
                sbb.append("[.]");
            }else{
                sbb.append(str1.charAt(i));
            }
        }
        return sbb.toString();  //to convert string builder into a string.
    }
}
