package com.company;

public class Q10 {
    public static void main(String[] args) {
        int[][] arr={{5,10},{2,5},{4,7},{3,9}};
        int ts=10;
        System.out.println(Uniits(arr,ts));
    }

    static int Uniits(int[][] boxTypes, int truckSize){
        int maxUnits=0;
        int row=0;
        while(row<boxTypes.length && truckSize>boxTypes[row][0] && truckSize>0 ){
            if(truckSize>=boxTypes[row][0]){
                truckSize-=boxTypes[row][0];
                maxUnits+=(boxTypes[row][0]*boxTypes[row][1]);
                row++;
            }else{
                maxUnits+=truckSize*(boxTypes[row][1]);
            }

        }
        return maxUnits+1;
    }
    }
