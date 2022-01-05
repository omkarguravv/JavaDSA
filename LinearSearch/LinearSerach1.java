package com.omkar.LinearSearch;


public class LinearSerach1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,19,10,171,16};
        int taregt = 3;
        int ans =linearSearch2(nums , taregt);
        System.out.println(ans);
    }
    //returns index at which target is present
    //if target is not present it will return -1
    static int linearSearch(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target){
                return index;
            }

        }
        return -1;
    }
    // return element if it is present
    static int linearSearch2(int[] arr, int target){

        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target){
                return arr[index];
            }

        }
        return -1;
    }
}
