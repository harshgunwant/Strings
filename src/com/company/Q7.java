package com.company;

public class Q7 {
    public static void main(String[] args) {
        int[] arr={1,1,7,4,9,2,5};
        System.out.println(Wiggle(arr));
    }
    static int Wiggle(int[] arr1){
        //edgecase
        if(arr1.length<2) return arr1.length;

        int count=2;
        for(int i=0;i< arr1.length-2;i++){
            if((arr1[i+1]-arr1[i])>0){
                if((arr1[i+2]-arr1[i+1])<0) count++;
            }
            else if((arr1[i+1]-arr1[i])<0){
                if((arr1[i+2]-arr1[i+1])>0) count++;
            }
        }
        if(count==2){
            if((arr1[1]-arr1[0])==0) return 1;
        }
        return count;
    }
}
