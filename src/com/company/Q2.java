package com.company;

public class Q2 {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,2,1,3};
        String s = "codeleet";
        System.out.println(restoreString(s,arr));
    }
    static String restoreString(String s, int[] indices){
        StringBuilder sbb=new StringBuilder();
        int i=0;
        int count=0;
        while(count< indices.length){
            if(i==indices[count]){
                sbb.append(s.charAt(count));
                i++;
                count=0;
            }else{
                count++;
        }
          }
        return sbb.toString();
    }
}
