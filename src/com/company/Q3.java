package com.company;

public class Q3 {
    public static void main(String[] args) {
        String cmd = "G()(al)";
        System.out.println(interpret(cmd));
    }
        static String interpret(String command) {
            StringBuilder sbb=new StringBuilder();
            for(int i=0;i<command.length();i++){
                if(command.charAt(i)=='G') sbb.append('G');
                else if(command.charAt(i)=='('){
                    if(command.charAt(i+1)==')'){
                        sbb.append('o');
                        i++;
                    }
                }
                else{
                    sbb.append("al");
                    i=i+3;
                }
            }
            return sbb.toString();
        }
}
