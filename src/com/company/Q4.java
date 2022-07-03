package com.company;

public class Q4 {
    public static void main(String[] args) {
        int n1=5;
        System.out.println(arrangeCoins(n1));
    }
    static int arrangeCoins(int n){
        int sum=n;
        int s=0,e=n;
        int count=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(sum>mid){
                sum=sum-(mid+1);
                e=mid-1;
            }
            else if(sum<mid) s=mid+1;


        }
        if(sum==0){
            return count;
        }
        return -1;
    }
}
