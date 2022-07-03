package com.company;

public class Q6 {
    public static void main(String[] args) {
        String s1="HEllO 11 fff";
        System.out.println(LowerCase(s1));
    }
    static String[] LowerCase(String s){
//        StringBuilder s1=new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
//                s1.append((char)(97+(s.charAt(i)-65)));
//            }else{
//                s1.append(s.charAt(i));
//            }
//        }
//        return s1.toString();
        String[] words=s.split(" ");
        return words;

    }
}
