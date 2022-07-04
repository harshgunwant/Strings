package com.company;

public class Q9 {
    public static void main(String[] args) {
        int[] rr={1,6,10,8,7,3,2};
        System.out.println(candy(rr));
    }
    static int candy(int[] ratings){
        int candies[] = new int[ratings.length];
        int sum = 0;
        for(int i = 1; i < ratings.length; i++)
// Traverse from left to right, and make sure that right higher rated child gets 1 more candy than left lower rated child
            if(ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;

        for(int i = ratings.length - 2; i >= 0; i--){
// Traverse from right to left, and make sure that left higher rated child gets 1 more candy than right lower rated child
            if(ratings[i] > ratings[i + 1])
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            sum += candies[i];
        }
        return sum + candies[ratings.length - 1] + ratings.length;
    }
    }
