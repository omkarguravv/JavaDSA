package com.omkar.practice;


public class MaximumNum {
    public static void main(String[] args) {
        int[] arr = {1,2,113,45,6,440};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,3));
    }

    static int maxRange(int[] arr , int start , int end){
        int maxval = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i]> maxval){
                maxval= arr[i];
            }

        }
        return maxval;
    }


   static int max(int[] arr){
        int maxval = arr[0];
       for (int i = 0; i < arr.length; i++) {
           if (arr[i]> maxval){
                maxval= arr[i];
           }

       }
       return maxval;
   }

}
