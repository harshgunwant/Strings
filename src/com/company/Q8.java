package com.company;

public class Q8 {
    public static void main(String[] args) {
        int col=701;
        System.out.println(Convert(col));
    }
    static String Convert(int columnNumber) {

        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            int rem = columnNumber%26;
            if(rem==0){
                rem = 26;
            }
            char ch = (char)('A'+(rem-1));
            sb.append(ch);
            columnNumber -= rem;
            columnNumber /= 26;
        }
        sb.reverse();
        return sb.toString();
    }
}
