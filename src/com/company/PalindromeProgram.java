package com.company;

public class PalindromeProgram {
    public static void main(String[] args) {
        //palindrom--- if you read a string from left to right and right to left and they are same the the string is a palindrome.
        //eg. abccba and a and naman etc.

        //design a programme to determine wether a string is palindrome or not?
        String str= "";
        str=str.toLowerCase();
        System.out.println(IsItPalindrome(str));
    }
    static boolean IsItPalindrome(String str1){
        //base
        if(str1.length()==1) return true;

        //

        //2 pointers approach
        int lp=0,rp=str1.length()-1;
        int count=0;
        while(lp<rp){
            if(str1.charAt(lp)==str1.charAt(rp)){
                count++;
            }
            lp++;
            rp--;
        }if(count==(str1.length()/2)) return true;
        return false;

    }
}
